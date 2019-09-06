package shape;

import resizeable.ResizeAble;

public class Square extends Rectangle implements ResizeAble {
    public Square() {
    }

    public Square(double side){
        super(side , side);
    }

    public Square(double side , String color , boolean filled) {
        super(side , side , color , filled);
    }

    public double getSide() {
        return getLength();
    }


    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public String toString() {
        return "Square with side: "+ getSide()
                +" is subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide() / 100) * percent);
    }
}
