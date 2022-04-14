package com.example.functionaljava.functional_thinking_examples.groovy.easyb

def it(spec, closure) {
    stepStack.startStep(listener, BehaviorStepType.IT, spec)
    closure.delegate = new EnsuringDelegate()
    try {
        if (beforeIt != null) {
            beforeIt()
        }
        listener.gotResult(new Result(Result.SUCCEEDED))
    use(BehaviorCategory) {
            closure()
        }
        if (afterIt != null) {
            afterIt()
        }
    } catch (Throwable ex) {
        listener.gotResult(new Result(ex))
    }
    stepStack.stopStep(listener)
}
