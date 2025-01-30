package ex28;

public class Average {
    public static void main(String[] args) {
        System.out.println(qualityPoints(80));
        
    }
    public static int qualityPoints(double average) {
        if ((average <= 100) && (average >= 90))
            return 4;
        else if ((average <= 89) && (average >= 80))
            return 3;
        else if ((average <= 79) && (average >= 70))
            return 2;
        else if ((average <= 69) && (average >= 60))
            return 1;
        return 0;
    }
}
