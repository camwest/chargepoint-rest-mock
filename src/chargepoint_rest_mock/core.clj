(ns chargepoint-rest-mock.core
    (:require [compojure.core :refer :all]
      [compojure.route :as route]
      [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/not-found "Not found"))

(def app
  (wrap-defaults app-routes api-defaults))
