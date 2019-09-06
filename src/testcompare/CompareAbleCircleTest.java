package testcompare;

import compareable.CompareableCircle;

import java.util.Arrays;

public class CompareAbleCircleTest {
    public static void main(String[] args) {
        CompareableCircle[] compareableCircles = new CompareableCircle[3];
        compareableCircles[0] = new CompareableCircle(2.0);
        compareableCircles[1] = new CompareableCircle();
        compareableCircles[2] = new CompareableCircle(3.0 , "Pink" , true);

        System.out.println("Pre-sort");
        for(CompareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }

        Arrays.sort(compareableCircles);
        System.out.println("After-sort");
        for(CompareableCircle compareableCircle : compareableCircles) {
            System.out.println(compareableCircle);
        }
    }
}
