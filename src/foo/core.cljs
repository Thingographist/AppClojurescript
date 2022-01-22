(ns foo.core
  (:require [foo.help :refer [help]]))

(defn ^:export check []
  (let [content (.. js/UrlFetchApp
                    (fetch "http://www.google.com/")
                    (getContentText response))]
    (js/Logger.log (subs content 0 30))
    (help))
  "ok")