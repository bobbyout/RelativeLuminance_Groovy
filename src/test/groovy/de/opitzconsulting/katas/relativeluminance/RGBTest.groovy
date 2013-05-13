package de.opitzconsulting.katas.relativeluminance

import org.junit.Assert
import org.junit.Test

import static org.junit.Assert.assertEquals

class RGBTest {

    public static final double PRECISION = 0.00001

    @Test
    void testRsRGB() {
        assert new RGB(255, 0, 0).rsRGB() == 1
        assert new RGB(0, 0, 0).rsRGB() == 0
        assertEquals(0.50196, new RGB(128, 0, 0).rsRGB(), PRECISION)
    }

    @Test
    void testGsRGB() {
        assert new RGB(0, 255, 0).gsRGB() == 1
        assert new RGB(0, 0, 0).gsRGB() == 0
        assertEquals(0.50196, new RGB(0, 128, 0).gsRGB(), PRECISION)
    }

    @Test
    void testBsRGB() {
        assert new RGB(0, 0, 255).bsRGB() == 1
        assert new RGB(0, 0, 0).bsRGB() == 0
        assertEquals(0.50196, new RGB(0, 0, 128).bsRGB(), PRECISION)
    }
}
