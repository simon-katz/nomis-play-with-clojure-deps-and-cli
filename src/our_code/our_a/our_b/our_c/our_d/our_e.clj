(ns our-code.our-a.our-b.our-c.our-d.our-e
  (:require
   [clojure.tools.logging :as log]))

(def cnt& (atom 0))

(defn log-1 []
  (let [cnt (swap! cnt& inc)
        msg (str "Hi from our-e " cnt)]
    (log/fatal "________________________________________")
    (log/trace msg)
    (log/debug msg)
    (log/info  msg)
    (log/warn  msg)
    (log/error msg)
    (log/fatal msg)))

(defn log-forever [interval-ms]
  (while true
    (log-1)
    (Thread/sleep interval-ms)))
