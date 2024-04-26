@echo off

set "ROOT_PATH=%CD%"
set "LIB_PATH=%ROOT_PATH%\Jarfiles"
java -jar "%LIB_PATH%\SER502-Striger-Team9.jar" "test/test1.stri"

echo Run successful
