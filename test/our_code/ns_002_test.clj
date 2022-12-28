(ns our-code.ns-002-test
  (:require
   [clojure.test :refer [deftest is]]
   [our-code.ns-002 :as sut]))

(deftest some-test-001
  (is (= 42
         sut/foo)))
