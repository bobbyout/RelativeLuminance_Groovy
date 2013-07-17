package de.opitzconsulting.katas.relativeluminance

import spock.lang.Specification
import spock.lang.Unroll

class ColorSpec extends Specification {

    @Unroll("relative luminance for R: #bigR, G: #bigG, B: #bigB is #value")
    void relativeLuminance() {
        given:
        Color color = new Color(0, 0, 0)
        color.rsRGB = rsRGB
        color.gsRGB = gsRGB
        color.bsRGB = bsRGB

        expect:
        color.relativeLuminance().setScale(5, BigDecimal.ROUND_HALF_UP) == value

        where:
        rsRGB   | gsRGB   | bsRGB   | value
        1       | 1       | 1       | 1
        0       | 0       | 0       | 0
        0.03922 | 0.03922 | 0.03922 | 0.00304
        0.04314 | 0.04314 | 0.04314 | 0.00335
        0.03922 | 0.04314 | 0.03922 | 0.00326
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

    @Unroll("xsRGB(#x8Bit) is #xsRGB")
    void xsRGB() {
        given:
        Color color = new Color(0, 0, 0);

        expect:
        color.xsRGB(x8Bit).setScale(5, BigDecimal.ROUND_HALF_UP) == xsRGB

        where:
        x8Bit | xsRGB
        0     | 0
        128   | 0.50196
        196   | 0.76863
        1     | 0.00392
    }
}
