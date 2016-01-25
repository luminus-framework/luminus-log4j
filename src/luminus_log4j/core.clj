(ns luminus-log4j.core)

(defn init [opts]
  (when-let [config (:log-config opts)]
    (org.apache.log4j.PropertyConfigurator/configure config)))
