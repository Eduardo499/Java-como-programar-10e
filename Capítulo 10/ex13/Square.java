package ex13;

public class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        if (side <= 0)
            throw new IllegalArgumentException("The side must be greater than 0");
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getName() {
        return "Quadrado";
    }
}