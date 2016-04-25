(defproject chargepoint-rest-mock "0.1.0-SNAPSHOT"
  :description "Fake REST API for http://chargepoint.com REST API"
  :url "https://github.com/camwest/chargepoint-rest-mock"
  :license {:name "The MIT license"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.0"]
                 [ring/ring-defaults "0.2.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler chargepoint-rest-mock.core/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
