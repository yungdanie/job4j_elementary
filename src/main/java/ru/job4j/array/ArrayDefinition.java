package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Daniel";
        names[1] = "Nikita";
        names[2] = "Vladimir";
        names[3] = "Dmitriy";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
