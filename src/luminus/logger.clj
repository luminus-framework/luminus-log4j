(ns luminus.logger
  (:require [clojure.java.io :as io])
  (:import org.apache.logging.log4j.LogManager))

(defn init [opts]
  (when-let [config (:log-config opts)]
    (.setConfigLocation (LogManager/getContext false) (.toURI (io/file config)))))
