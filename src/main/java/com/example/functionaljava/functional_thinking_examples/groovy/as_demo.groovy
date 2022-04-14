package com.example.functionaljava.functional_thinking_examples.groovy

h = [hasNext: { h.i > 0 }, next: {h.i--}]
h.i = 10   // <1>
def pseudoIterator = h as Iterator   // <2>
                                                          
while (pseudoIterator.hasNext())
  print pseudoIterator.next() + (pseudoIterator.hasNext() ? ", " : "\n")
// 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,
