(defproject client-application "0.1.0"
  :description "Simple client project for studies purposes"
  :url "http://jalarcon.com"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [clj-http "3.13.0"]]
  :main ^:skip-aot client-application.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
