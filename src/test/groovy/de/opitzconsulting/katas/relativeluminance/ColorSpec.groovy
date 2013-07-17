package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

class ColorSpec extends Specification {

    @Unroll("relative luminance for R: #bigR, G: #bigG, B: #bigB is #value")
    void relativeLuminance() {
        given:
        Color color = new Color(r, g, b)

        expect:
        color.relativeLuminance().setScale(5, BigDecimal.ROUND_HALF_UP) == value

        where:
        r   | g   | b   | value
        255 | 255 | 255 | 1
        0   | 0   | 0   | 0
        10  | 10  | 10  | 0.00304
        11  | 11  | 11  | 0.00335
        10  | 11  | 10  | 0.00326
    }

    @Unroll("bigX(#xsRGB) is #bigX")
    void bigX() {
        expect:
        Color.bigX(xsRGB).setScale(5, BigDecimal.ROUND_HALF_UP) == bigX

        where:
        xsRGB   | bigX
        0       | 0
        0.03922 | 0.00304
        0.04314 | 0.00335
        1       | 1
    }

    @Unroll("xsRGB(#x8Bit) is #xsRGB")
    void xsRGB() {
        expect:
        Color.xsRGB(x8Bit).setScale(5, BigDecimal.ROUND_HALF_UP) == xsRGB

        where:
        x8Bit | xsRGB
        0     | 0
        128   | 0.50196
        196   | 0.76863
        1     | 0.00392
    }
}
