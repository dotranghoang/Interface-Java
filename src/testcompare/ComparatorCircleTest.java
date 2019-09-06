package testcompare;

import comparator.CompareCircle;
import shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(2.2);
        circles[1] = new Circle();
        circles[2] = new Circle(1.5 , "Red" , false);

        System.out.println("Pre-sort: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator comparatorCircle = new CompareCircle();
        Arrays.sort(circles , comparatorCircle);
        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        System.out.println(comparatorCircle.compare(circles[0] , circles[1]));
    }
}
