package ua.goit.andrey.module4.distance;

public class Distance {
    public static double distanceBetweenAandB(double x1, double x2, double y1, double y2) {
        return Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1, 2)));
    }
}
