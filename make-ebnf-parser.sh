#!/bin/sh
alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
cd grammar-gen/src/main/antlr4
antlr4 EBNF.g4 -o ../java/pl/project13/jo/antlr
