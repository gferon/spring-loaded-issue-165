package org.gferon

import io.bit3.jsass.Compiler
import io.bit3.jsass.Options

class TestController {

    def failWithLibrary() {
        Compiler compiler = new Compiler();
        Options options = new Options();
        def compiled = compiler.compileString("body { display: none; }", options)
        render text: compiled
    }

    def failWithoutLibrary() {
        new LambdaTest().printList()
        render text: "Yay"
    }
}
