package shape;

import resizeable.ResizeAble;

public class Rectangle extends Shape implements ResizeAble {
    private double width = 0.0, length = 0.0;

    public Rectangle() {
    }

    public Rectangle(double width , double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width , double length , String color , boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with width: "+getWidth()+" length: "+getLength()
                +" is subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        setLength(getLength() + ( getLength() / 100 ) * percent );
        setWidth(getWidth() + ( getWidth() / 100 ) * percent );
    }
}
