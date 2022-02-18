package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K4Square0dot64() {
        double expected = 0.64;
        int p = 4;
        double k = 4;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K5Square0dot868() {
        double expected = 0.868;
        int p = 5;
        double k = 5;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

}