package lsp;

public class Quadrate extends Rectangle{

    private double side;
    private double width;

    public Quadrate(double side){
        this.side = side;

    }

    public Quadrate(double side, double width){
        this.side = side;
        this.width = width;
    }


    @Override
    public double area() {

        if (width <= 0) {
            return Math.pow(side, 2);
        } else if (width >= 0) {
            return side * width;
        }
        return 0;
    }

}

