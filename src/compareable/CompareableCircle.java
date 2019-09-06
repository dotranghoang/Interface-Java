package compareable;

import shape.Circle;

public class CompareableCircle extends Circle implements Comparable<CompareableCircle> {
    public CompareableCircle() {
    }

    public CompareableCircle(double radius) {
        super(radius);
    }

    public CompareableCircle(double radius , String color , boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(CompareableCircle c) {
        if(getRadius() > c.getRadius()) {
            return 1;
        } else if(getRadius() < c.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
