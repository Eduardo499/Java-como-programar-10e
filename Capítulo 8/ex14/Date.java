package ex14;

import java.util.HashMap;
import java.util.Map;

public class Date {
    private int month;
    private int day;
    private int year;
    
    // Mapeamento de meses por nome
    private static final Map<String, Integer> monthMap = new HashMap<>();
    
    static {
        monthMap.put("January", 1);
        monthMap.put("February", 2);
        monthMap.put("March", 3);
        monthMap.put("April", 4);
        monthMap.put("May", 5);
        monthMap.put("June", 6);
        monthMap.put("July", 7);
        monthMap.put("August", 8);
        monthMap.put("September", 9);
        monthMap.put("October", 10);
        monthMap.put("November", 11);
        monthMap.put("December", 12);
    }

    // Construtor 1: Recebe mês, dia e ano como inteiros
    public Date(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > daysInMonth(month, year) || year < 0) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Construtor 2: Recebe nome do mês, dia e ano como String e inteiros
    public Date(String monthName, int day, int year) {
        if (!monthMap.containsKey(monthName) || day < 1 || day > daysInMonth(monthMap.get(monthName), year) || year < 0) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.month = monthMap.get(monthName);
        this.day = day;
        this.year = year;
    }

    // Construtor 3: Recebe o número do dia no ano e o ano
    public Date(int dayOfYear, int year) {
        if (dayOfYear < 1 || dayOfYear > 365 || year < 0) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.year = year;
        this.month = 1;
        while (dayOfYear > daysInMonth(month, year)) {
            dayOfYear -= daysInMonth(month, year);
            month++;
        }
        this.day = dayOfYear;
    }

    // Método para calcular o número de dias de um mês específico
    private int daysInMonth(int month, int year) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29; // Fevereiro em ano bissexto
        }
        return daysPerMonth[month - 1];
    }

    // Método para verificar se um ano é bissexto
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    // Método para gerar a data no formato MM/DD/YYYY
    public String toMMDDYYYY() {
        return String.format("%02d/%02d/%d", month, day, year);
    }

    // Método para gerar a data no formato "Month Day, Year"
    public String toMonthDayYear() {
        String monthName = getMonthName(month);
        return String.format("%s %d, %d", monthName, day, year);
    }

    // Método para gerar a data no formato "DDD YYYY" (dia do ano, ano)
    public String toDDDYYYY() {
        int dayOfYear = getDayOfYear(month, day, year);
        return String.format("%d %d", dayOfYear, year);
    }

    // Método para obter o nome do mês baseado no número do mês
    private String getMonthName(int month) {
        for (Map.Entry<String, Integer> entry : monthMap.entrySet()) {
            if (entry.getValue() == month) {
                return entry.getKey();
            }
        }
        return null; // Não deve acontecer
    }

    // Método para calcular o dia do ano (DDD)
    private int getDayOfYear(int month, int day, int year) {
        int dayOfYear = 0;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth(i, year);
        }
        dayOfYear += day;
        return dayOfYear;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Testando o primeiro construtor
        Date date1 = new Date(6, 14, 1992);
        System.out.println("Data 1 (MM/DD/YYYY): " + date1.toMMDDYYYY());
        System.out.println("Data 1 (Month Day, Year): " + date1.toMonthDayYear());
        System.out.println("Data 1 (DDD YYYY): " + date1.toDDDYYYY());

        // Testando o segundo construtor
        Date date2 = new Date("June", 14, 1992);
        System.out.println("\nData 2 (MM/DD/YYYY): " + date2.toMMDDYYYY());
        System.out.println("Data 2 (Month Day, Year): " + date2.toMonthDayYear());
        System.out.println("Data 2 (DDD YYYY): " + date2.toDDDYYYY());

        // Testando o terceiro construtor
        Date date3 = new Date(165, 1992);
        System.out.println("\nData 3 (MM/DD/YYYY): " + date3.toMMDDYYYY());
        System.out.println("Data 3 (Month Day, Year): " + date3.toMonthDayYear());
        System.out.println("Data 3 (DDD YYYY): " + date3.toDDDYYYY());
    }
}
