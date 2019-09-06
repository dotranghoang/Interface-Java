package resizetest;

import shape.Rectangle;

public class ResizeRectangle {
    public static void main(String[] args) {
        Rectangle[] resizeRectangles = new Rectangle[3];
        resizeRectangles[0] = new Rectangle();
        resizeRectangles[1] = new Rectangle(20, 40);
        resizeRectangles[2] = new Rectangle(40, 80, "Pink", true);
        System.out.println("Pre-Resize");

        for (Rectangle resizeRectangle : resizeRectangles) {
            System.out.println(resizeRectangle);
        }

        System.out.println("\n");

        int percent;
        for (int i = 0 ; i < resizeRectangles.length ; i++) {
            percent = (int) (Math.random() * 100) + 1;
            resizeRectangles[i].resize(percent);
            System.out.println("After-Resize " + percent + "%");
            System.out.println(resizeRectangles[i]);
        }
    }
}
