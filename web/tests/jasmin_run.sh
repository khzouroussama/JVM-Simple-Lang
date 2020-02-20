#!/bin/bash

echo ">building .."
java -jar jasmin.jar programmeObject.j
echo ">Output:"
java -cp . Test