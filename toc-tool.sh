#!/bin/bash

# echo $(dirname $0)
cd $(dirname $0)
SHELLDIR=$(pwd)
CREATETOOLRELATIVEPATH="create-toc/pdf-toc-creator.py"
DELETETOOLRELATIVEPATH="delete-toc"

# echo $SHELLDIR

arg_num=$#
file_path=$1
offset=$2
toc_path=$3
flag=$4

if [[ $arg_num = 4 && "$flag" == "--delete" ]];then
    # TODO delete toc --> create toc
    echo $file_path
    processed_file_path=${file_path%.pdf}_toc-deleted.pdf
    echo $processed_file_path
    echo $offset
    echo $toc_path
    echo $flag
    cd $DELETETOOLRELATIVEPATH
    # pwd
    mvn clean compile exec:exec -Dexec.executable="java" -Dexec.args=" -classpath %classpath my.tool.pdf.App $file_path $processed_file_path" 
    # echo mvn clean compile exec:exec -Dexec.executable="java" -Dexec.args=" -classpath %classpath my.tool.pdf.App $file_path $processed_file_path" 
    cd $SHELLDIR
    echo $SHELLDIR
    python3 $CREATETOOLRELATIVEPATH -f $processed_file_path -o $offset -t $toc_path
    rm -fr $processed_file_path
else
    # TODO create toc
    # echo $file_path
    # echo $offset
    # echo $toc_path
    # echo $(pwd)
    # echo $CREATETOOLRELATIVEPATH
    python3 $CREATETOOLRELATIVEPATH -f $file_path -o $offset -t $toc_path 
fi;