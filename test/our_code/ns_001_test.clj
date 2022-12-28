(ns our-code.ns-001-test
  (:require
   [clojure.test :refer [deftest is]]
   [our-code.ns-001 :as sut]))

(deftest de-morgan-test
  (doseq [x [false true]
          y [false true]]
    (is (= (sut/foo-1 x y)
           (sut/foo-2 x y)))))
