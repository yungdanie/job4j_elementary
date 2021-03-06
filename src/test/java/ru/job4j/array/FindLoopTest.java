package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {0, 4, 3, 0, 5, 6, 7};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas100Then1() {
        int[] data = {1, 100, 2, 3, 4, 5, 6};
        int el = 100;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int start = 0;
        int finish = 7;
        int el = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void whenDiapasonHas1Then7() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int start = 5;
        int finish = 7;
        int el = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 7;
        assertEquals(expected, result);
    }
}