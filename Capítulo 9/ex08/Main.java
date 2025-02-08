public class Main {
    public static void main(String[] args) {
        // Criando os pontos
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(0, 3);

        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        Square square = new Square(p1, p2, new Point(2, 2), new Point(0, 2)); // Quadrado com pontos ajustados

        // Exibindo as áreas
        System.out.println("Área do trapézio: " + trapezoid.area());
        System.out.println("Área do paralelogramo: " + parallelogram.area());
        System.out.println("Área do retângulo: " + rectangle.area());
        System.out.println("Área do quadrado: " + square.area());
    }
}