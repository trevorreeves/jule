(ns jule.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (defn RunRule [rule factSource]
    (let [result ((:condition rule) factSource)]))

  (RunRule #{:condition (fn [])})

  (println "Rule executed"))
