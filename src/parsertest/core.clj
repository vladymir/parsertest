(ns parsertest.core
  (:gen-class)
  (:require [instaparse.core :as insta]))

(def git-parser (insta/parser (slurp "grammar.ebnf")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (git-parser (slurp "sample.txt"))))