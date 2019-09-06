package resizetest;

import shape.Circle;

public class ResizeCircleTest {
    public static void main(String[] args) {
        Circle[] resizeCirles = new Circle[3];
        resizeCirles[0] = new Circle();
        resizeCirles[1] = new Circle(10.0);
        resizeCirles[2] = new Circle(20.0 , "Red" , true);
        System.out.println("Pre-Resize");

        for (Circle resizeCirle : resizeCirles) {
            System.out.println(resizeCirle+"\n");
        }

        int percent;

        for (int i = 0 ; i < resizeCirles.length ; i++) {
            percent = (int) (Math.random() * 100) + 1;
            resizeCirles[i].resize(percent);
            System.out.println("After-Resize "+ percent +"%");
            System.out.println(resizeCirles[i]+"\n");
        }
    }
}
