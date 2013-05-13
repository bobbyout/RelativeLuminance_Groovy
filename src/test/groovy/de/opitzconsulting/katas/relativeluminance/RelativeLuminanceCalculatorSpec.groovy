package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

import static org.junit.Assert.assertEquals


class RelativeLuminanceCalculatorSpec extends Specification {

    @Unroll("calculate relative luminance for #r8Bit, #g8Bit, #b8Bit -> #value")
    void "calculate relative luminance"() {
        expect:
        assertEquals value, new RGB(r8Bit, g8Bit, b8Bit).relativeLuminance, RGBTest.PRECISION

        where:
        r8Bit | g8Bit | b8Bit | value
        0     | 0     | 0     | 0
        10    | 10    | 10    | 0.00304
        11    | 11    | 11    | 0.00335
        255   | 255   | 255   | 1
    }
}
