package compareable;

import shape.Rectangle;

public class CompareableRectangle extends Rectangle implements Comparable<CompareableRectangle> {
    public CompareableRectangle() {
    }

    public CompareableRectangle(double width , double length) {
        super(width, length);
    }

    public CompareableRectangle(double width , double length , String color , boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public int compareTo(CompareableRectangle r) {
        if(getArea() > r.getArea()) {
            return 1;
        } else if(getArea() < r.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
