## Interactive Development

Copy and paste the following snippet into your `playground.clj` file.

```clojure
; Configure your keymap/key binding to eval forms into REPL:
; On IntelliJ you can configure Settings > Keymap > Plugins > Cursive.
; Usually I prefer the following keymap:

; Load file in REPL: CMD + SHIFT + L
; Send top form to REPL: CMD + SHIFT + P to evaluate parent form
; Send form right before caret to REPL: CMD + P to evaluate the form right before the caret (cursor)

; Remember to open your repl with credentials from the AWS BR Account

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
; Desired output
; => ["yellow" "brown" "red" "purple"]




;2 create a function that map every color in the map to upper case
; Desired output
; => [{:name "banana", :color "YELLOW"}
;     {:name "pineapple", :color "BROWN"}
;     {:name "apple", :color "RED"}
;     {:name "grape", :color "PURPLE"}]

(clojure.repl/find-doc "upper")



;3 remove all fruits that have red as their color
; Desired output
; => [{:name "banana", :color "yellow"} {:name "pineapple", :color "brown"} {:name "grape", :color "purple"}]


;4 Remove bananas and red fruits
; Desired output
; [{:name "pineapple"
;   :color "brown"}
;  {:name "grape"
;   :color "purple"}]


;--------------------------------------------------------------------------
; Find and fix the error in the following function (debugging each form individually)

(defn foo
  [n]
  (cond (> n 40) (+ n 20)
        (> n 20) (- (first n) 20)
        :else 0))

(foo 10)
(foo 30)

; -------------------------------------------------------------------------
; AWS API from cognitect
(require '[cognitect.aws.client.api :as aws])
(def client (aws/client {:api :s3 :region :sa-east-1}))
(aws/ops client)



; List the objects from nu-tmp/<name>/





; Put the object into nu-tmp/<name>/test





; Get nu-tmp/<name>/test

```


































































