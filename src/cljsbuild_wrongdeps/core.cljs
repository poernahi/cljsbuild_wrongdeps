(ns cljsbuild-wrongdeps.core
  (:require [react]
            [react-dom]))

(enable-console-print!)

(def app (.getElementById js/document "app"))

(react-dom/render (react/createElement "h1" nil "It's alive!")
                  app)
