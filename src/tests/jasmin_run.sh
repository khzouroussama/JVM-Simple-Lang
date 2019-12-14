#!/bin/bash
# My first script
cd /home/temp/IdeaProjects/AntlrExps/src/tests/
echo ">building .."
java -jar jasmin.jar programmeObject.j
echo ">Output:"
java -cp . Test