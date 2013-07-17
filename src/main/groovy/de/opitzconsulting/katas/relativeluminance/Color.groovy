package de.opitzconsulting.katas.relativeluminance

class Color {

    int r
    int g
    int b

    Color(BigDecimal r, BigDecimal g, BigDecimal b) {
        this.r = r
        this.g = g
        this.b = b
    }

    BigDecimal relativeLuminance() {
        return 0.2126 * bigX(xsRGB(r)) + 0.7152 * bigX(xsRGB(g)) + 0.0722 * bigX(xsRGB(b))
    }

    static BigDecimal bigX(BigDecimal xsRGB) {
        if (xsRGB <= 0.03928)
            return xsRGB / 12.92
        return Math.pow((xsRGB + 0.055) / 1.055, 2.4)
    }

    static BigDecimal xsRGB(int x8Bit) {
        return x8Bit / 255
    }
}
