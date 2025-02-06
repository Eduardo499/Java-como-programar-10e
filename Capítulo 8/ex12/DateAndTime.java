package ex12;

public class DateAndTime {
    private int month;
    private int day;
    private int year;
    private int totalSeconds;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateAndTime(int month, int day, int year, int totalSeconds) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }
        if (year < 1) {
            throw new IllegalArgumentException("Year must be positive");
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Invalid day for the given month and year");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public DateAndTime() {
        this(0, 0, 0);
    }

    public DateAndTime(int hour) {
        this(hour, 0, 0);
    }

    public DateAndTime(int hour, int minute) {
        this(hour, minute, 0);
    }

    public DateAndTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public DateAndTime(DateAndTime time) {
        this.totalSeconds = time.totalSeconds;
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Hour, minute, and second must be within valid range");
        }
        this.totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
        this.totalSeconds = hour * 3600 + getMinute() * 60 + getSecond();
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
        this.totalSeconds = getHour() * 3600 + minute * 60 + getSecond();
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
        this.totalSeconds = getHour() * 3600 + getMinute() * 60 + second;
    }

    public int getHour() {
        return totalSeconds / 3600;
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSecond() {
        return totalSeconds % 60;
    }

    public void tick() {
        totalSeconds = (totalSeconds + 1) % 86400; // Incrementa um segundo, reseta após 24h
    }

    public void incrementMinute() {
        totalSeconds = (totalSeconds + 60) % 86400; // Incrementa um minuto, reseta após 24h
    }

    public void incrementHour() {
        totalSeconds = (totalSeconds + 3600) % 86400; // Incrementa uma hora, reseta após 24h
        // Verifica se a hora chegou a 24 e chama nextDay se necessário
        if (getHour() == 0 && getMinute() == 0 && getSecond() == 0) {
            nextDay(); // Chama o próximo dia se a hora foi incrementada para 24:00
        }
    }
    
    private int daysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysPerMonth[month];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public void nextDay() {
        if (day < daysInMonth(month, year)) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    public String toString() {
        String dateString = String.format("%d/%d/%d", month, day, year);
        
        String timeString = String.format("%d:%02d:%02d %s", 
                                          (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12, 
                                          getMinute(), 
                                          getSecond(), 
                                          (getHour() < 12 ? "AM" : "PM"));
        
        return dateString + " " + timeString;
    }

    public static void main(String[] args) {
        // Criando um objeto DateAndTime com data e hora especificadas
        DateAndTime dateAndTime1 = new DateAndTime(3, 15, 2025, 0);  // 15/03/2025
        dateAndTime1.setTime(14, 30, 45);  // Hora: 14:30:45 (2:30:45 PM)

        // Imprimindo a data e a hora formatadas
        System.out.println("Data e Hora 1: " + dateAndTime1);

        // Criando um objeto DateAndTime usando o construtor sem argumentos (valores padrão)
        DateAndTime dateAndTime2 = new DateAndTime();
        System.out.println("Data e Hora 2 (padrão): " + dateAndTime2);

        // Modificando a hora, minuto e segundo do objeto dateAndTime1
        dateAndTime1.setHour(10);  // Hora: 10
        dateAndTime1.setMinute(15);  // Minuto: 15
        dateAndTime1.setSecond(30);  // Segundo: 30

        // Imprimindo a data e hora modificadas
        System.out.println("Data e Hora 1 modificada: " + dateAndTime1);

        // Testando o incremento de um dia
        dateAndTime1.nextDay();  // Avança para o próximo dia
        System.out.println("Data e Hora 1 após próximo dia: " + dateAndTime1);

        // Testando a mudança de hora
        dateAndTime1.incrementHour();  // Incrementa 1 hora
        System.out.println("Data e Hora 1 após incremento de 1 hora: " + dateAndTime1);

        // Testando o método tick() (incrementa 1 segundo)
        dateAndTime1.tick();  // Incrementa 1 segundo
        System.out.println("Data e Hora 1 após tick(): " + dateAndTime1);
    }
}