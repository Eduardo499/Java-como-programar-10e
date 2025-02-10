package ex17;


import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionA("Exceção do tipo ExceptionA");
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            throw new ExceptionB("Exceção do tipo ExceptionB");
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            throw new NullPointerException("Exceção NullPointerException");
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            throw new IOException("Exceção IOException");
        } catch (Exception e) {
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}