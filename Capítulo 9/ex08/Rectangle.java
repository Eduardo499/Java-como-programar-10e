public class Rectangle extends Quadrilateral {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double base = Math.abs(getPoints()[0].getX() - getPoints()[1].getX());
        double altura = Math.abs(getPoints()[0].getY() - getPoints()[2].getY());
        return base * altura;
    }
}