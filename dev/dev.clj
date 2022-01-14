(ns dev
  (:require
   [clojure.tools.logging :as log]
   [other-code.other-a.other-b.other-c.other-d.other-e :as other-e]
   [our-code.our-a.our-b.our-c.our-d.our-e :as our-e]))

(defn log-1 []
  (other-e/log-1)
  (our-e/log-1))

(defn log-forever [interval-ms]
  (future (other-e/log-forever interval-ms))
  (future (our-e/log-forever interval-ms)))

(defn log-from-dev []
  (log/info "DevDevDev"))
