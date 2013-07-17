package de.opitzconsulting.katas.relativeluminance

class Color {

    BigDecimal rsRGB
    BigDecimal gsRGB
    BigDecimal bsRGB

    Color(BigDecimal r, BigDecimal g, BigDecimal b) {
    }

    BigDecimal relativeLuminance() {
        return 0.2126 * bigX(rsRGB) + 0.7152 * bigX(gsRGB) + 0.0722 * bigX(bsRGB)
    }

    BigDecimal bigX(BigDecimal xsRGB) {
        if (xsRGB <= 0.03928)
            return xsRGB / 12.92
        return Math.pow((xsRGB + 0.055) / 1.055, 2.4)
    }
}
