package testcompare;

import compareable.CompareableRectangle;

import java.util.Arrays;

public class CompareAbleRectangleTest {
    public static void main(String[] args) {
        CompareableRectangle[] compareableRectangles = new CompareableRectangle[3];
        compareableRectangles[0] = new CompareableRectangle(2.1 , 3.1);
        compareableRectangles[1] = new CompareableRectangle();
        compareableRectangles[2] = new CompareableRectangle(2.0 , 2.9 , "Blind" , false);

        System.out.println("Pre-sort");
        for(CompareableRectangle compareableRectangle : compareableRectangles) {
            System.out.println(compareableRectangle);
        }

        Arrays.sort(compareableRectangles);
        System.out.println("After-sort");
        for(CompareableRectangle compareableRectangle : compareableRectangles) {
            System.out.println(compareableRectangle);
        }
    }
}
