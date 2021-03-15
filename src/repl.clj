(ns repl)

(do
;; "Diese REPL-Kochsession stammt von der Clojure UG Bonn 👋"
  (def 🐔 '🐔)
  (def 🐷 '🐷)
  (def 🐟 '🐟)
  (def 🐮 '🐮)
  (def 🦄 '🦄)
  (def 🌈 '🌈)
  (def 🥩 '🥩)
  (def 🥚 '🥚)
  (def 🌽 '🌽)
  (def 🍈 '🍈)
  (def 🍉 '🍉)
  (def 🥔 '🥔)
  (def 🎂 '🎂)
  (def 🍰 '🍰)

  (def 🏔 '🏔)
  (def 🐉 '🐉)

  (defn 🔪
    "Use sharp knife."
    [x]
    (case x
      🐟 '🍣
      🍈 '🍉
      🎂 '🍰
      🐮 '🥩
      🐉 '🏔
      🦄 '🌈
      x))

  (defn 🔥
    "Burn things."
    [x]
    (case x
      🥚 '🍳
      🌽 '🍿
      🥔 '🍟
      🐔 '🍗
      🐷 '🥓
      🥩 '🍔
      x)))


(comment
  ;; In IntelliJ + Cursive:
  ;; 1. Tools -> REPL zeigt nützliche Shortcuts
  ;; 2. Unten rechts "Paredit" auf "Parinfer" stellen

  ;; Zahlen
  42
  1.3
  4/3

  ;; Strings
  "schnaqqi"
  (type "schnaqqi")

  ;; Characters
  \f
  (type \f)

  ;; Keywords, evaluieren zu sich selbst
  :foo
  (type :foo)

  ;; Symbole, referenzieren i.d.R. etwas anderes
  ;; `def` definiert global, `let` lokal
  (def x 42)
  x

  (+ x 1)
  x

  (let [y 21]
    y)
  y


  ;; Funktionen, letzte Anweisung im Codeblock ist der Rückgabewert
  +
  (+ 1 2)
  (* 2 (inc 2))

  (def square1
    (fn [n]
      (* n n)))
  (square1 4)


  (defn square2
    [n]
    (* n n))
  (square2 4)




  🔥



  🔪





  ;; Lazy Sequences
  (set! *print-length* 20)

  (range)


  ;;;; Collections
  ;; Vektoren
  []
  (type [])

  ;; Listen
  '()

  ;; Sets
  #{"bar" "foo"}

  ;; Maps
  {}
  {"key" "value"}

  (def mymap
    {"key" "value"
     :clojure :rocks})

  (get mymap "key")
  (get mymap :clojure)
  (get mymap :non-existent)

  (:clojure mymap)


  ;; Higher Order Functions
  ;; Funktionen, die Funktionen als Parameter bekommen oder eine Funktion zurückgeben
  map

  (map inc [1 2 3])
  ;; => ((inc 1) (inc 2) (inc 3))

  (reduce + [1 2 3 4])
  ;; => (+ (+ (+ 1 2) 3) 4)


  ;; There is a function for it...

  (filter
   (fn [n] (= 0 (mod n 2)))
   (range 1 20))


  ;; Java Interop

  (.toUpperCase "schnaqqi")
  ;; Java: "schnaqqi".toUpperCase()

  (import java.util.Stack)


  ;; Java Interop, wo Objekte zwischen Clojure und Java hin und hergereicht werden können,
  ;; funktioniert wunderbar bspw. über Java Interfaces.
  ;; Ein Beispiel dazu findet ihr hier: https://github.com/n2o/rover-kata-java


  :jatumba)