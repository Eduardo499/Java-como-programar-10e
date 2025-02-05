package ex04;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        try {
            Rectangle rect = new Rectangle(10.5, 5.3);
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Perimeter: " + rect.calculatePerimeter());
            System.out.println("Area: " + rect.calculateArea());

            rect.setLength(15.2);
            rect.setWidth(7.8);
            System.out.println("\nAfter modification:");
            System.out.println("Length: " + rect.getLength());
            System.out.println("Width: " + rect.getWidth());
            System.out.println("Perimeter: " + rect.calculatePerimeter());
            System.out.println("Area: " + rect.calculateArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}