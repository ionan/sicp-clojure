(ns sicp-clojure.core-test
  (:require [clojure.test :refer :all]
            [sicp-clojure.core :refer :all]))

(deftest square-2-test
  (testing "The square of 2 is 4."
    (is (= 4 (square 2)))))

(deftest square-3-test
  (testing "The square of 3 is 9."
    (is (= 9 (square 3)))))
