(ns baot.core
  (:require [clojure.core.reducers :as ccr]))

(deftype Foo []
  ccr/CollFold
  (coll-fold [this x x x] nil))
