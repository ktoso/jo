#!/bin/sh
alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
cd main/src/main/antlr4
antlr4 GoLang.g4 -o ../java/pl/project13/jo/antlr
