package testcompare;

import shape.Square;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSquareTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(2.2);
        squares[1] = new Square();
        squares[2] = new Square(2.3, "White" , true);

        System.out.println("Pre-sort");
        for (Square square : squares) {
            System.out.println(square);
        }

        Comparator comparatorSquare = new comparator.CompareSquare();
        Arrays.sort(squares , comparatorSquare);
        System.out.println("After-sort:");
        for (Square square : squares) {
            System.out.println(square);
        }
    }

}
