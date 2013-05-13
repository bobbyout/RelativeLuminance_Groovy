package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

class RelativeLuminanceCalculatorSpec extends Specification {

    RGB calculator

    def setup() {
        calculator = new RGB()
    }

    void "calculator is initialized"() {
        expect:
        calculator
    }

    @Unroll("calculateRelativeLuminance #rgb -> #value")
    void "calculate relative luminance"() {
        expect:
        calculator.calculateRelativeLuminance(r, g, b) == value

        where:
        r    | g    | b    | value
        "ff" | "ff" | "ff" | 42
        "cc" | "cc" | "cc" | 42
        "33" | "33" | "33" | 42
    }
}
