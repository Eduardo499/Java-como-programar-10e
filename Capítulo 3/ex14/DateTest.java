package ex14;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(01, 20, 25);
        date.displayDate();
        date.setYear(2021);
        date.setMonth(2);
        date.setDay(29);
        date.displayDate();
    }
}
