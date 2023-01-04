#/usr/bin/env python
import re
import os
import shubhlipi as sh
if len(sh.argv) == 0:
    exit()
if sh.argv[0] == '--install':
    import sys
    py_path = os.path.dirname(sys.executable)+r"\Scripts"
    sh.write(f'{py_path}\\runjava.py', sh.read('javatool.py'))
    print('This Tool should be installed on command line as \'runjava\'')
    exit()
nm = sh.argv[0]
if not os.path.isfile(f"{nm}.java"):
    print(nm+".java not found")
    exit()
compile_data = sh.cmd(f"javac {nm}.java", display=False)
if compile_data[0] != 0:
    print(compile_data[1].replace('\r', '\n'))
pth = nm.split('/')
parent_path = sh.parent(nm)
if compile_data[0] == 0:
    try:
        cm = ''
        if len(pth) > 1:
            cm += f"cd {parent_path}\n"
        sh.cmd(f"{cm}java {pth[-1]}", direct=False)
    except:
        pass
for x in re.findall(r"class \w+", sh.read(f'{nm}.java')):
    pth = f"{parent_path}/{x[6:]}.class"
    if os.path.isfile(pth):
        sh.delete_file(pth)
