(ns our-code.ns-001)

(println "\u001b[36m==== Reloading our-code.ns-001\u001b[0m")

(defn foo-1 [a b]
  (or a b))

(defn foo-2 [a b]
  (not (and (not a) (not b))))

(defn some-fun-1 [m]
  (println "====" (merge {:this-is "some-fun-1"}
                         m))
  42)

(defn some-fun-2 [m]
  (println "====" (merge {:this-is "some-fun-2"}
                         m))
  42)
