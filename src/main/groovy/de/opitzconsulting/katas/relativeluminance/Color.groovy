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
}
