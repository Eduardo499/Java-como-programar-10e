public class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double base1 = Math.abs(getPoints()[0].getX() - getPoints()[1].getX());
        double base2 = Math.abs(getPoints()[2].getX() - getPoints()[3].getX());
        double altura = Math.abs(getPoints()[0].getY() - getPoints()[2].getY());
        return (base1 + base2) * altura / 2;
    }
}
