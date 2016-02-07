package ua.goit.andrey.module4.square;

public class Square {

    public static double squareTriangle(double a, double b, double c) {
        double p = (a + b + c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double SquareCircle(double r) {
        return Math.PI * r * r;
    }

    public static double squareRectangle(double a, double b) {
        return a * b;
    }
}
