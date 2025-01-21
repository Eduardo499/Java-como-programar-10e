package ex17;

import java.time.LocalDate;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String sex;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double height;
    private double weight;

    LocalDate currentDate = LocalDate.now();
    int currentYear = currentDate.getYear();

    public HealthProfile(String firstName, String lastName, String sex, int birthMonth, int birthDay, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
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
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
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
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public double getBMI(double height, double weight) {
        return weight / (height * height);
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
    public static void main(String[] args) {
        HealthProfile john = new HealthProfile("John", "Doe", "M", 1, 1, 2000, 1.75, 75.0);
        System.out.printf("First Name: %s%n", john.getFirstName());
        System.out.printf("Last Name: %s%n", john.getLastName());
        System.out.printf("Sex: %s%n", john.getSex());
        System.out.printf("Birth Date: %d/%d/%d%n", john.getBirthMonth(), john.getBirthDay(), john.getBirthYear());
        System.out.printf("Height: %.2f%n", john.getHeight());
        System.out.printf("Weight: %.2f%n", john.getWeight());
        System.out.printf("BMI: %.2f%n", john.getBMI(john.getHeight(), john.getWeight()));
        System.out.printf("Age: %d%n", john.getAge());
        System.out.printf("Maximum Heart Rate: %d%n", john.getMaximumHeartRate());
        System.out.printf("Target Heart Rate: %s%n%n", john.getTargetHeartRate());
        
        HealthProfile jane = new HealthProfile("Jane", "Doe", "F", 1, 1, 2000, 1.65, 60.0);
        System.out.printf("First Name: %s%n", jane.getFirstName());
        System.out.printf("Last Name: %s%n", jane.getLastName());
        System.out.printf("Sex: %s%n", jane.getSex());
        System.out.printf("Birth Date: %d/%d/%d%n", jane.getBirthMonth(), jane.getBirthDay(), jane.getBirthYear());
        System.out.printf("Height: %.2f%n", jane.getHeight());
        System.out.printf("Weight: %.2f%n", jane.getWeight());
        System.out.printf("BMI: %.2f%n", jane.getBMI(jane.getHeight(), jane.getWeight()));
        System.out.printf("Age: %d%n", jane.getAge());
        System.out.printf("Maximum Heart Rate: %d%n", jane.getMaximumHeartRate());
        System.out.printf("Target Heart Rate: %s%n", jane.getTargetHeartRate());
    }
}