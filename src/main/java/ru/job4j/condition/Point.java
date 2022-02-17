package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double differenceX1X2 = x2 - x1;
        double differenceY1Y2 = y2 - y1;
        double squareDiffX1X2 = Math.pow(differenceX1X2, 2);
        double squareDiffY1Y2 = Math.pow(differenceY1Y2, 2);
        double sum = squareDiffX1X2 + squareDiffY1Y2;
        double sqrtSum = Math.sqrt(sum);
        return sqrtSum;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
