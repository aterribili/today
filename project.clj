(defproject today "0.1.0-SNAPSHOT"
  :description "Hola"
  :url "https://github.com/aterribili/today"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.cognitect.aws/api "0.8.408"]
                 [com.cognitect.aws/s3 "780.2.583.0"]
                 [com.cognitect.aws/endpoints "1.1.11.692"]
                 [org.clojure/tools.namespace "0.3.1"]]
  :profiles {:dev {:source-paths   ["config"]}}
  :repl-options {:init-ns user})
