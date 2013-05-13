package de.opitzconsulting.katas.relativeluminance

class RGB {

    def r
    def g
    def b

    RGB(def r, def g, def b) {
        this.r = r
        this.g = g
        this.b = b
    }

    def rsRGB() {
        r / 255
    }

    def gsRGB() {
        g / 255
    }

    def bsRGB() {
        b / 255
    }
}
