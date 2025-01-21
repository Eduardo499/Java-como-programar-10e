package ex16;
import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();
    
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    public int getBirthMonth() {
        return birthMonth;
    }
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    public int getBirthDay() {
        return birthDay;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getAge() {
        return currentYear - birthYear;
    }
    public int getMaximumHeartRate() {
        return 220 - getAge();
    }
    public String getTargetHeartRate() {
        return String.format("%.0f-%.0f", getMaximumHeartRate() * 0.5, getMaximumHeartRate() * 0.85);
    }
    public String getBirthDate() {
        return String.format("%d/%d/%d", birthMonth, birthDay, birthYear);
    }
    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
    public String toString() {
        return String.format("Full Name: %s%nBirth Date: %s%nAge: %d%nMaximum Heart Rate: %d%nTarget Heart Rate: %s", getFullName(), getBirthDate(), getAge(), getMaximumHeartRate(), getTargetHeartRate());
    }
    public static void main(String[] args) {
        HeartRates person = new HeartRates("John", "Doe", 1, 1, 2000);
        System.out.println(person);
        System.out.printf("Maximum Heart Rate: %d%n", person.getMaximumHeartRate());
        System.out.printf("Target Heart Rate: %s%n", person.getTargetHeartRate());
    }
}
