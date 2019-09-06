package resizetest;

import shape.Square;

public class ResizeSquare {
    public static void main(String[] args) {
        Square[] resizeSquares = new Square[3];
        resizeSquares[0] = new Square();
        resizeSquares[1] = new Square(20);
        resizeSquares[2] = new Square(20 , "Violet" , false);
        System.out.println("Pre-Resize");

        for (Square resizeSquare : resizeSquares) {
            System.out.println(resizeSquare);
        }

        System.out.println("\n");
        int percent;
        for (int i = 0 ; i < resizeSquares.length ; i++) {
            percent = (int) (Math.random() * 100) + 1;
            resizeSquares[i].resize(percent);
            System.out.println("After-Resize " + percent + "%");
            System.out.println(resizeSquares[i]);
        }
    }
}
