#!/bin/bash

cd /home/oussama/IdeaProjects/AntlrExps/src/tests/
echo ">building .."
java -jar jasmin.jar programmeObject.j
echo ">Output:"
java -cp . Test