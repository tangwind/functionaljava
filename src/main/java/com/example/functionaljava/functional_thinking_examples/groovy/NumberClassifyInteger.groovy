package com.example.functionaljava.functional_thinking_examples.groovy

Integer.metaClass.isPerfect = {->
  Classifier.isPerfect(delegate)
}

Integer.metaClass.isAbundant = {->
  Classifier.isAbundant(delegate)
}

Integer.metaClass.isDeficient = {->
  Classifier.isDeficient(delegate)
}
