package ocp;



public class Rectangle extends Shape{


    private double wight;
    private double height;

    public Rectangle(String color, double wight, double height) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    @Override
    public double area() {
        return wight * height;
    }
}
