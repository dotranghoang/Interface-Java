package comparator;

import shape.Square;

import java.util.Comparator;

public class CompareSquare implements Comparator<Square> {
    public int compare(Square s1 , Square s2) {
        if(s1.getPerimeter() > s2.getPerimeter()) {
            return 1;
        } else if(s1.getPerimeter() < s2.getPerimeter()) {
            return -1;
        } else {
            return 0;
        }
    }
}
