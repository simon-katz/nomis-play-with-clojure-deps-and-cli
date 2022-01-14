(ns other-code.other-a.other-b.other-c.other-d.other-e
  (:require
   [clojure.tools.logging :as log]))

(def cnt& (atom 0))

(defn log-1 []
  (let [cnt (swap! cnt& inc)
        msg (str "Hi from other-e " cnt)]
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
