package de.opitzconsulting.katas.relativeluminance

import org.junit.Test

import static org.junit.Assert.assertEquals

class RGBTest {

    public static final double PRECISION = 0.00001

    @Test
    void testRsRGB() {
        assert new RGB(255, 0, 0).rsRGB == 1
        assert new RGB(0, 0, 0).rsRGB == 0
        assertEquals 0.50196, new RGB(128, 0, 0).rsRGB, PRECISION
    }

    @Test
    void testGsRGB() {
        assert new RGB(0, 255, 0).gsRGB == 1
        assert new RGB(0, 0, 0).gsRGB == 0
        assertEquals 0.50196, new RGB(0, 128, 0).gsRGB, PRECISION
    }

    @Test
    void testBsRGB() {
        assert new RGB(0, 0, 255).bsRGB == 1
        assert new RGB(0, 0, 0).bsRGB == 0
        assertEquals 0.50196, new RGB(0, 0, 128).bsRGB, PRECISION
    }

    @Test
    void calculateRGB() {
        assert RGB.calculateRGB(0) == 0
        assertEquals 0.00232, RGB.calculateRGB(0.03), PRECISION
        assertEquals 0.00304, RGB.calculateRGB(0.03928), PRECISION
        assertEquals 0.00304, RGB.calculateRGB(0.03929), PRECISION
        assertEquals 0.00304, RGB.calculateRGB(0.03935), PRECISION
        assertEquals 0.00304, RGB.calculateRGB(10 / 255), PRECISION
        assertEquals 0.00305, RGB.calculateRGB(0.03936), PRECISION
        assertEquals 0.00320, RGB.calculateRGB(0.04127), PRECISION
        assertEquals 0.00335, RGB.calculateRGB(11 / 255), PRECISION
        assert RGB.calculateRGB(1) == 1
    }
}
