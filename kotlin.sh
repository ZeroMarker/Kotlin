:<<'COMMENT'
https://kotlinlang.org/docs/command-line.html
COMMENT

kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar

kotlinc -d main.jar main.kt && kotlin -classpath main.jar MainKt

kotlinc

# REPL
:quit
