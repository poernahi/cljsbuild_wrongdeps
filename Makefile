CLJS=cljs.jar

out/main.js: src/cljsbuild_wrongdeps/core.cljs
	java -cp $(CLJS):src clojure.main build.clj

.PHONY: clean

clean:
	rm -rf node_modules out package.json package-lock.json
