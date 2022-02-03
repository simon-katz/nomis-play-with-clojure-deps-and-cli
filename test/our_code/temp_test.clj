(ns our-code.temp-test
  (:require
   [clojure.test :refer [deftest is]]
   [our-code.temp :as sut]))

(deftest de-morgan-test []
  (doseq [x [false true]
          y [false true]]
    (is (= (sut/foo-1 x y)
           (sut/foo-2 x y)))))
