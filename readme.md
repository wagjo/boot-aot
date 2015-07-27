Steps to reproduce

`boot repl`

`(require 'baot.core)`

all works fine, but with aot:

`boot aot repl`

`(require 'baot.core)`

`java.lang.NoClassDefFoundError: clojure/core/reducers/CollFold`

`java.lang.ClassNotFoundException: clojure.core.reducers.CollFold`
