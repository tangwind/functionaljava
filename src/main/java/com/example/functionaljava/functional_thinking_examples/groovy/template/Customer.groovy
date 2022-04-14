package com.example.functionaljava.functional_thinking_examples.groovy.template;

abstract class Customer {
    def plan
    
    def Customer() {
        plan = []
    }
    
    def abstract checkCredit()
    def abstract checkInventory()
    def abstract ship()
    
    def process() {
        checkCredit()
        checkInventory()
        ship()
    }
}