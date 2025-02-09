package ex13;

import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shapes = new Shape[4];
        
        shapes[0] = new Circle(rand.nextInt(10) + 1);
        shapes[1] = new Square(rand.nextInt(10) + 1);
        shapes[2] = new Sphere(rand.nextInt(10) + 1);
        shapes[3] = new Cube(rand.nextInt(10) + 1);

        for (Shape shape : shapes) {
            System.out.println("Forma: " + shape.getName());
            if (shape instanceof TwoDimensionalShape) {
                System.out.printf("Área: %.2f\n", ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                System.out.printf("Área: %.2f, Volume: %.2f\n", 
                    ((ThreeDimensionalShape) shape).getArea(),
                    ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println("--------------------");
        }
    }
}