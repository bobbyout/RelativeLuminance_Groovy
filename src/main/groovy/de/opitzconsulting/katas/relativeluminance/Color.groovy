package de.opitzconsulting.katas.relativeluminance

class Color {

    BigDecimal bigR
    BigDecimal bigG
    BigDecimal bigB

    Color(BigDecimal bigR, BigDecimal bigG, BigDecimal bigB) {
        this.bigR = bigR
        this.bigG = bigG
        this.bigB = bigB
    }

    BigDecimal relativeLuminance() {
        return 0.2126 * bigR + 0.7152 * bigG + 0.0722 * bigB
    }

    BigDecimal bigX(BigDecimal xsRGB) {
        if (xsRGB <= 0.03928)
            return xsRGB / 12.92
        return Math.pow((xsRGB + 0.055) / 1.055, 2.4)
    }
}
