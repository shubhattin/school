#!/bin/bash

# A Simple Command Line Tool Simplify running single java programs
# Prefer the pytho version, as that is more powefull

run_java(){
    if javac "$1.java"; then # compilling the java program to bytecode
        current_dir="$(pwd)"
        parent_dir="$(dirname "$1.java")"
        cd "$parent_dir" # changing dir to the PARENT folder
        file_name="$(basename "$1")" # Extracting file name out of the path
        java "$file_name"
        rm *.class
        cd $current_dir
        # Restoring to the original directory, but its not needed
    fi
}

if [ "$1" = "" ]; then
    echo "Provide a Java file to execute"
    exit 1
# currently suspending the install option to encourage using the python version
# elif [ "$1" = "--install" ]; then
#     cp "./runjava.sh" "$HOME/.local/bin/runjava"
#     chmod +x "$HOME/.local/bin/runjava"
#     echo "Installed 'runjava'. Copied to \"$HOME/.local/bin\""
elif [ -f "$1.java" ] ; then
    # Without .java
    run_java "$1"
elif [[ -f "$1" ]] && [[ "$1" == *.java ]] ; then
    # With .java
    run_java "${1%.*}"
else
    echo "$1.java not found"
    exit 1
fi
exit
