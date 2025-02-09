package ex13;

public class Triangle extends TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        if (base <= 0)
            throw new IllegalArgumentException("The base must be greater than 0");
        if (height <= 0)
            throw new IllegalArgumentException("The height must be greater than 0");

        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String getName() {
        return "Triângulo";
    }
}
