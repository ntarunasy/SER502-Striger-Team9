# SER502-Striger-Team9

System built on Windows 10 Home(Version 22H2).

Tools Used:
- [IntelliJ Idea](https://www.jetbrains.com/idea/)
- [Antlr 4.13.1](https://www.antlr.org/download.html)
- Antlr Intellij Plugin

Required JAR Files(Present in data directory):
- Antlr 4.13.1
- SER502-Striger-Team9.jar

Directions to run language:
- Open Terminal in Project Directory.(Command Prompt or Shel based on Device).
- Terminal Commands:
  - cd data (to use the Project JarFile and access testfiles).
  - java -jar "SER502-Striger-Team9.jar" test1.stri (testn.stri (n is any number from 1 to 5)).

Directions to build and run language:
- Open Project on IntelliJ
- Go to File in IntelliJ (Menubar)
- Go to Project Structure in File
- Click on Artifacts
- Click + -> Jar -> from module dependencies
- Click the dropdown and select the Main.java Class and click on include tests then click OK
- Go to Build on Menubar
- Build Artifacts -> Build
- A new package would popup called JarFiles
- Move the project JAR file from JarFiles to data for easier execution and run the language(steps included above(Directions to run language)).

YouTube Video:
- SER502-Striger-Team9
- https://youtu.be/LUDFisDjzsg

Batch Script file should be run from Command Prompt directly using the command:
cmd.bat (From the project directory).
