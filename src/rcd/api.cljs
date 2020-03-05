(ns rcd.api
  (:require
   [castra.core :as c]
   [javelin.core :as j :include-macros true :refer [defc]]))

(defc res nil)
(defc err nil)
(defc loading nil)

(def random (c/mkremote 'rcd.api/random res err loading))
