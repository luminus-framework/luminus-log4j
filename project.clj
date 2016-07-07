(defproject luminus-log4j "0.1.6"
  :description "Log4j adapter for Luminus"
  :url "https://github.com/luminus-framework/luminus-log4j"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [log4j-edn-config "0.1.0"]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.6.1"]
                 [org.apache.logging.log4j/log4j-core "2.6.1"]])
