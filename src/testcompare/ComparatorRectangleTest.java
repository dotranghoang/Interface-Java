package testcompare;

import comparator.CompareRectangle;
import shape.Rectangle;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorRectangleTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2.6 , 3.5);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(3.6 , 2.4 , "Red" ,false);

        System.out.println("Pre-sort:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator comparatorRectangle = new CompareRectangle();
        Arrays.sort(rectangles, comparatorRectangle);
        System.out.println("After-sort: ");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

    }
}
