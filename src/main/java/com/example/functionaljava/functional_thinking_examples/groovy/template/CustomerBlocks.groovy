package com.example.functionaljava.functional_thinking_examples.groovy.template;

class CustomerBlocks {
    def plan, checkCredit, checkInventory, ship
    
    def CustomerBlocks() {
        plan = []
    }
    
    def process() {
        checkCredit()
        checkInventory()
        ship()
    }
}