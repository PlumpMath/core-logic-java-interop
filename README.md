# Interfacing with Clojure core.logic from plain ol' Java

Quick demo for exposing a Java interface into a Sudoku solver built using Clojure core.logic.
Code lifted from [core.logic examples](https://github.com/clojure/core.logic/wiki/Examples).
Install Java, Leiningen, and Gradle. 

Build:

    cd sudoku-logic-solver
    lein install
    cd ../sudoku-client
    gradle execute

This was used to accompany a talk called [Poly-paradigm Java](https://www.icloud.com/keynote/000DC0VmlCSh9MckDa8yOH0LQ#Poly-paradigm_Java)
that I gave at the Oracle Java Day in Johannesburg on 9 March 2016.
