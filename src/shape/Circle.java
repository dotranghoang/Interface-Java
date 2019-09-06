package shape;

import resizeable.ResizeAble;

public class Circle extends Shape implements ResizeAble {
    private double radius = 0.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius , String color , boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle with radius: "+ getRadius()
                +" is subclass of "+ super.toString();
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (getRadius()/100) * percent);
    }
}
