public class Square extends Quadrilateral {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double lado = Math.abs(getPoints()[0].getX() - getPoints()[1].getX());
        return lado * lado;
    }
}
