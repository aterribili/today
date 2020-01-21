## Interactive Development

Copy and paste the following snippet into your `playground.clj` file.

```clojure
; -------------------------------------------------------------------------
; Lets try

(def coll [{:name "banana"
            :color "yellow"}
           {:name "pineapple"
            :color "brown"}
           {:name "apple"
            :color "red"}
           {:name "grape"
            :color "purple"}])

;1 map the coll into colors only

;2 create a function that map every color in the map to upper case

;3 remove all fruits that have red as their color

;4 compose the 3 and 1 functions into coll




;--------------------------------------------------------------------------
; Find and fix the error in the following function

(defn ->string-without-dash [value]
  (def value value)
  (cond (keyword? value) (-> value name (clojure.string/replace #"-" ""))
        (string? value)  (clojure.string/replace value #"-" "")
        (nil? value)     (name value)
        :else            ""))

(->string-without-dash nil)
(->string-without-dash "scan-marzano")
(->string-without-dash :scan-marzano)



; -------------------------------------------------------------------------
; AWS API from cognitect




; List the objects from nu-tmp/<name>/





; Put the object into nu-tmp/<name>/test





; Get nu-tmp/<name>/test

```


































































