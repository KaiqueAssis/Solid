package ocp;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{


    private double wight;
    private double height;

    public Rectangle(String color, double wight, double height) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return wight * height;
    }
}
