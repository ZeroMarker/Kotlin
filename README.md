# Kotlin
Kotlin grammar
## How to run in command line

[Kotlin](https://kotlinlang.org/docs/command-line.html)

```kt
kotlinc hello.kt -include-runtime -d hello.jar
java -jar hello.jar
```

```kt
kotlinc -d main.jar main.kt && kotlin -classpath main.jar MainKt
```