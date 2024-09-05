(ns rest-api-sample.handler
  (:use compojure.core)
  (:use cheshire.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as middleware]
            [ring.util.response :as response]))

(defn greetings-response
  "Return a cordial greetings in json format"
  []
  (response/response {:greetings "Good day! The peace of Christ!"}))


(defroutes app-routes
  (context "/test" [] (defroutes test-routes
    (GET "/" [] (greetings-response)))
  (route/not-found "Not found")))

(def app
  (-> (handler/api app-routes)
      (middleware/wrap-json-body)
      (middleware/wrap-json-response)))


