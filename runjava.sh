#!/bin/bash

# A Simple Command Line Tool Simplify running single java programs

if [ "$1" = "" ]; then 
    echo "Provide a Java file to execute"
    exit 1
elif [ "$1" = "--install" ]; then
    cp "./runjava.sh" "$HOME/.local/bin/runjava"
    chmod +x "$HOME/.local/bin/runjava"
    echo "Installed 'runjava'. Copied to \"$HOME/.local/bin\""
elif [ -f "$1.java" ] ; then
    javac "$1.java" # compilling the java program to bytecode
    current_dir="$(pwd)"
    parent_dir="$(dirname "$1.java")"
    cd "$parent_dir" # changing dir to the PARENT folder
    file_name="$(basename "$1")" # Extracting file name out of the path
    java "$file_name"
    rm "$file_name.class"
    cd $current_dir
    # Restoring to the original directory, but its not needed
else
    echo "$1.java not found"
    exit 1
fi
exit
