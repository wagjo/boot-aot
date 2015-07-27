(set-env!
 :resource-paths #{"src"})

(task-options!
 aot {:namespace '#{baot.core}}
 pom {:project 'baot
      :version "0.1.0"})
