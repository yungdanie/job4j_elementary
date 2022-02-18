package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double delAndDiv(double first, double second) {
        return delta(first, second)
                + div(first, second);
    }

    public static double sumAllMeth(double first, double second) {
        return sum(first, second) + multiply(first, second) + delta(first, second) + div(first, second);
    }

    public static void main(String[] args) {
    }
}
