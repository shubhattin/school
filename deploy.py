import shubhlipi as sh
import os

sh.cmd('python cpy.py')
if sh.cmd('git switch pages')[0] == 0:
    for x in os.listdir('./'):
        if x not in ["build", ".git"]:
            sh.delete(x)
    for x in [".gitignore", 'cpy.py', 'deploy.py', 'javatool.py', 'README.md', "proj", "algo"]:
        sh.delete(f'build/{x}')
    sh.copy_folder('./build', './')
    sh.delete_folder('./build')
    sh.cmd('git add ."', direct=False)
    sh.cmd('git commit -am "deploy"', direct=False)
    sh.cmd('git push', direct=False)
    sh.cmd('git switch main', direct=False)
else:
    print("please commit the branch first")
