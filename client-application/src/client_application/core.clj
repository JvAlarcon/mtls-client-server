(ns client-application.core
  (:require
   [clj-http.client :as client]))

(def certificate-data
  {:keystore "./resources/certificate/client_certificate.p12"
   :keystore-type "pkcs12"
   :keystore-pass "jv246@@"})

(defn handle-response
  "Handle the http response from server"
  [{status :status
    body :body}]
  (println "HTTP status received:" status)
  (println "Body received:" body))

(handle-response (client/get "https://localhost/" certificate-data))

(defn -main
  "Send a GET request to server in mTLS and print response received"
  [& args]
  (handle-response (client/get "https://localhost/" certificate-data)))
