(ns rcd.login-test
  (:require
   [rcd.test-fixtures :as fixtures]

   [clojure.test :refer :all]
   [etaoin.api :refer :all]))

(use-fixtures :each fixtures/drivers)

(deftest initial-page-load
  (doto fixtures/*driver*
    (go "http://localhost:8080/")
    (is (= (get-title) "rcd"))))
