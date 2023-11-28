# Makefile for Kotlin Hello World program

KOTLINC = kotlinc
JAVA = java

SRC = hello.kt
OUT = hello.jar

all: compile run clean

compile:
	$(KOTLINC) $(SRC) -include-runtime -d $(OUT)

run:
	$(JAVA) -jar $(OUT)

clean:
	rm -f $(OUT)

