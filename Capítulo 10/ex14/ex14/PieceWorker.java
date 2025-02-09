package ex14;

public class PieceWorker extends Employee {
    private double wage;
    private int pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, int pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wage < 0.0) 
            throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        if (pieces < 0) 
            throw new IllegalArgumentException("Pieces produced must be >= 0");
        this.wage = wage;
        this.pieces = pieces;
    }

    public void setWage(double wage) { this.wage = wage; }
    public double getWage() { return wage; }
    public void setPieces(int pieces) { this.pieces = pieces; }
    public int getPieces() { return pieces; }

    @Override
    public double earnings() {
        return getWage() * getPieces();
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s%n%s: $%,.2f; %s: %d", 
            super.toString(), "wage per piece", getWage(), "pieces produced", getPieces());
    }
}