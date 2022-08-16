public class Circle {
    final static double pi = 3.14;

    public static double area(int radius) {
        return pi * (radius * radius);
    }

    public static double circumference(int radius) {
        return 2 * pi * radius;
    }
 }
