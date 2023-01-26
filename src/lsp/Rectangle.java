package lsp;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return width;
    }


    @Override
    public double area() {
        return width * height;
    }
}
