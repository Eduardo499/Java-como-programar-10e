package ex13;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(double radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("The radius must be greater than 0");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Círculo";
    }
}
