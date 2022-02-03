(ns our-code.temp)

(defn foo-1 [a b]
  (or a b))

(defn foo-2 [a b]
  (not (and (not a) (not b))))
