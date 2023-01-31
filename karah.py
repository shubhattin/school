from typing import Dict
from markdown.extensions.toc import TocExtension
import markdown, os, re, shubhlipi as sh, jinja2
from pygments.formatters import HtmlFormatter

c = 0

# We are using Github Actions to deploy our site to Github Pages
# This script will be invoked to build the output to 'build' folder

def main():
    global c
    tm = sh.time()
    NM = "जावोपानुप्रयोगानि"
    if len(sh.argv) == 0:
        lc = "./build"
    elif len(sh.argv[0]) != 1:
        print("Invalid Drive letter")
        exit(-1)
    elif len(sh.argv[0]) == 1:
        lc = f"{sh.argv[0]}:/{NM}"
    if os.path.isfile(lc):
        sh.delete(lc)
    sh.makedir(lc)
    README = sh.read("README.md")

    print(f"{c+1}. Started Compiling and Copying", end="\t")

    def render(fl_name: str, **o) -> str:
        return (
            jinja2.Environment(loader=jinja2.FileSystemLoader("template"))
            .get_template(fl_name)
            .render(**o)
        )

    def markdowninfy(vl: str, h_link=True) -> str:
        opt = ["codehilite", "fenced_code", "tables"]
        if h_link:
            opt.append(TocExtension(permalink=True))
        return markdown.markdown(vl, extensions=opt)

    QUESTIONS: Dict[str, str] = {}
    for x in re.findall(r"\d+\. .+?\[.+?\]\(.+?/\w+\.java\)", README, re.DOTALL):
        nm_str: str = re.findall(r"\[.+?\]\(.+?/\w+?\.java\)", x)[0]
        nm = nm_str[nm_str.index("(") + 1 : -1]
        x = x[x.index(".") + 2 : -len(nm_str)]
        QUESTIONS[nm] = markdowninfy(x)
    frm = sh.parent(__file__)
    ALGO_REGEX = re.compile(r"(?<=/\*\n \* Algorithm\n).+?(?=\n \*/)", re.DOTALL)
    ALGO_REGEX_INCLUDED = re.compile(r"/\*\n \* Algorithm\n.+?\n \*/", re.DOTALL)
    VARIABLE_REGEX = re.compile(
        r"(?<=/\*\n \* Variable Description\n).+?(?=\n \*/)", re.DOTALL
    )
    VARIABLE_REGEX_INCLUDED = re.compile(
        r"/\*\n \* Variable Description\n.+?\n \*/", re.DOTALL
    )
    for x in os.listdir("./"):
        if x[-6:] == ".class" or x in ["build", ".git", ".vscode", "temp"]:
            continue
        if os.path.isfile(x):
            sh.copy_file(x, lc + f"/{x}")
        elif os.path.isdir(x):
            dir_made = False
            for y in os.listdir(x):
                if y in ["src"] or re.match(r"\.temp$", y):
                    continue
                if re.match(r".+\.(pdf|docx|txt|md)$", y):
                    sh.copy_file(f"{x}/{y}", f"{lc}/{x}/{y}")
                    continue
                if y[-6:] == ".class" or not y.endswith(".java"):
                    continue
                if not dir_made:
                    sh.makedir(lc + f"/{x}/src")
                else:
                    dir_made = True
                vl = sh.read(f"{x}/{y}")
                sh.write(f"{lc}/{x}/src/{y}", vl)
                opt = dict(
                    code_highlight_css=f'<style>{HtmlFormatter(style="emacs", full=True,cssclass="codehilite").get_style_defs()}</style>',
                    title=y.split(".")[0],
                    md_program=markdowninfy(
                        f"```java\n{VARIABLE_REGEX_INCLUDED.sub('',ALGO_REGEX_INCLUDED.sub('',vl))}\n```"
                    ),
                )
                if f"./{x}/{y}" in QUESTIONS:
                    opt["question"] = QUESTIONS[f"./{x}/{y}"]
                algo_ref = ALGO_REGEX.findall(vl)
                if len(algo_ref) == 1:
                    algo = re.compile(r"^ \* ", re.MULTILINE).sub("", algo_ref[0])
                    opt["alogorithm"] = markdowninfy(algo, False)
                var_ref = VARIABLE_REGEX.findall(vl)
                if len(var_ref) == 1:
                    variable = re.compile(r"^ \* ", re.MULTILINE).sub("", var_ref[0])
                    opt["variable"] = markdowninfy(variable, False)
                sh.write(
                    f"{lc}/{x}/{y.split('.')[0]}.html",
                    render("prog.html.j2", **opt),
                )
    README = README.replace("./proj/ques.md", "./proj/ques.html")
    sh.write(
        lc + "/index.html",
        render(
            "home.html.j2",
            md_content=markdowninfy(README.replace(".java)", ".html)")),
            title=NM,
        ),
    )
    c += 1
    if True:  # Project Question list generator
        sh.delete(f"{lc}/proj/ques.md")
        sh.write(
            f"{lc}/proj/ques.html",
            render("ques.html.j2", questions=markdowninfy(sh.read("proj/ques.md"))),
        )
    print(f"success in {round(sh.time() - tm, 3)}s")


if __name__ == "__main__":

    if sh.args(0) == "watch":
        sh.argv.clear()
        import keyboard as key
        main()
        key.add_hotkey("ctrl+shift+cmd", main)
        key.wait("shift+esc")
    else:
        main()
