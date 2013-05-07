package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

class RelativeLuminanceCalculatorSpec extends Specification {

    RelativeLuminanceCalculator calculator

    def setup() {
        calculator = new RelativeLuminanceCalculator()
    }

    void "calculator is initialized"() {
        expect:
        calculator
    }

    @Unroll("calc #rgb -> #value")
    void "calc"() {
        expect:
        calculator.calc(rgb) == value

        where:
        rgb      | value
        "ffffff" | 42
        "cccccc" | 42
        "333333" | 42
    }
}
