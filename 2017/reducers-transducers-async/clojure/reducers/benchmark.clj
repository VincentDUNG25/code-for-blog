(ns reducers.benchmark
  (:require [clojure.core.reducers :as r]))

;(def s (range 0 9999999))
;(time (reduce + 0 (map inc (filter even? s))))
;(time (reduce + 0 (r/map inc (r/filter even? s)))))