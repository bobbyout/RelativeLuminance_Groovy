package de.opitzconsulting.katas.relativeluminance

class RGB {

    def rsRGB
    def gsRGB
    def bsRGB

    RGB(def r8Bit, def g8Bit, def b8Bit) {
        rsRGB = r8Bit / 255
        gsRGB = g8Bit / 255
        bsRGB = b8Bit / 255
    }

    static def calculateRGB(def sRGB) {
        if (sRGB <= 0.03928)
            sRGB / 12.92
        else
            Math.pow((sRGB + 0.055) / 1.055, 2.4)
    }

    def getRelativeLuminance() {
        def r = calculateRGB(rsRGB)
        def g = calculateRGB(gsRGB)
        def b = calculateRGB(bsRGB)
        0.2126 * r + 0.7152 * g + 0.0722 * b
    }
}
