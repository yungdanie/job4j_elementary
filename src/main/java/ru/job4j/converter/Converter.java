package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float in2 = 120;
        float expected = 2;
        float out = Converter.rubleToEuro(in1);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        out = Converter.rubleToDollar(in2);
        passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}
