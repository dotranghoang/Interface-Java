package compareable;

import shape.Square;

public class CompareableSquare extends Square implements Comparable<CompareableSquare> {
    public CompareableSquare() {
    }

    public CompareableSquare(double side) {
        super(side);
    }

    public CompareableSquare(double side , String color , boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compareTo(CompareableSquare s) {
        if(getArea() > s.getArea()) {
            return 1;
        } else if (getArea() < s.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
