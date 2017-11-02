(require 'cljs.build.api)

(cljs.build.api/build "src" {:output-to "out/main.js"
                             :main 'cljsbuild-wrongdeps.core
                             :install-deps true
                             :npm-deps {:react "15.6.1"
                                        :react-dom "15.6.1"}})
