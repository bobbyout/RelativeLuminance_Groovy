package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

class ColorSpec extends Specification {

    @Unroll("relative luminance for R: #bigR, G: #bigG, B: #bigB is #value")
    void relativeLuminance() {
        given:
        Color color = new Color(bigR, bigG, bigB)

        expect:
        color.relativeLuminance().setScale(5, BigDecimal.ROUND_HALF_UP) == value

        where:
        bigR    | bigG    | bigB    | value
        1       | 1       | 1       | 1
        0       | 0       | 0       | 0
        0.00304 | 0.00304 | 0.00304 | 0.00304
        0.00335 | 0.00335 | 0.00335 | 0.00335
        0.00304 | 0.00335 | 0.00304 | 0.00326
    }

    @Unroll("bigX(#xsRGB) is #bigX")
    void bigX() {
        given:
        Color color = new Color(0, 0, 0);

        expect:
        color.bigX(xsRGB).setScale(5, BigDecimal.ROUND_HALF_UP) == bigX

        where:
        xsRGB   | bigX
        0       | 0
        0.03922 | 0.00304
        0.04314 | 0.00335
        1       | 1
    }
}
