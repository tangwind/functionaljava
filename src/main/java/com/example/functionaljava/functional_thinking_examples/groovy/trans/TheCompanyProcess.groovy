package com.example.functionaljava.functional_thinking_examples.groovy.trans

class TheCompanyProcess {
// BEGIN groovy_process
  public static String cleanUpNames(listOfNames) {
    listOfNames
        .findAll { it.length() > 1 }
        .collect { it.capitalize() }
        .join ','
  }
// END groovy_process

}
