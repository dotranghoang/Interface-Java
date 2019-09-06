package testcompare;

import compareable.CompareableSquare;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class CompareAbleSquare {
    public static void main(String[] args) {
        CompareableSquare[] compareableSquares = new CompareableSquare[3];
        compareableSquares[0] = new CompareableSquare(4.5, "Darkness" , false);
        compareableSquares[1] = new CompareableSquare(4.2);
        compareableSquares[2] = new CompareableSquare();

        System.out.println("Pre-sort");
        for (CompareableSquare compareableSquare : compareableSquares) {
            System.out.println(compareableSquare);
        }

        Arrays.sort(compareableSquares);
        System.out.println("After-sort");
        for (CompareableSquare compareableSquare : compareableSquares) {
            System.out.println(compareableSquare);
        }
    }
}
