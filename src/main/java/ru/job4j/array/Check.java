package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            boolean ref = data[0];
            if (ref != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
