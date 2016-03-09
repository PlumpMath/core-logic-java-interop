(defproject com.p12v.sudoku/sudoku-logic-solver "0.1.0-SNAPSHOT"
  :description "Sudoku solver using core.logic example exposing a Java wrapper"
  :url "http://p12v.com"
  :license {:name "Apache 2.0 License"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"],
                 [org.clojure/core.logic "0.8.10"]]
  :main ^:skip-aot com.p12v.logic.Sudoku
  :aot [sudoku-logic-solver.core]
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
)
