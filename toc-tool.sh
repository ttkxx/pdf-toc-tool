#!/bin/bash

cd $(dirname $0)
SHELLDIR=$(pwd)
CREATETOOLRELATIVEPATH="create-toc/pdf-toc-creator.py"
DELETETOOLRELATIVEPATH="delete-toc"

arg_num=$#
file_path=$1
offset=$2
toc_path=$3
flag=$4

if [[ $arg_num = 4 && "$flag" == "--delete" ]];then
    # delete toc --> create toc
    processed_file_path=${file_path%.pdf}_toc-deleted.pdf
    cd $DELETETOOLRELATIVEPATH
    mvn clean compile exec:exec -Dexec.executable="java" -Dexec.args=" -classpath %classpath my.tool.pdf.App $file_path $processed_file_path" 
    cd $SHELLDIR
    python3 $CREATETOOLRELATIVEPATH -f $processed_file_path -o $offset -t $toc_path
    rm -fr $processed_file_path
else
    # create toc
    python3 $CREATETOOLRELATIVEPATH -f $file_path -o $offset -t $toc_path 
fi;