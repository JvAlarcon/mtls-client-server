(defproject rest-api-sample "0.1.0"
  :description "Simple REST server for studies purposes"
  :url "http://jalarcon.com"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [compojure "1.7.1"]
                 [ring/ring-defaults "0.5.0"]
                 [ring/ring-json "0.5.1"]
                 [cheshire "5.13.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler rest-api-sample.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.4.0"]]}})

