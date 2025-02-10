package ex18;

import ex17.ExceptionA;
import ex17.ExceptionB;

public class CatchOrderDemo {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("Exceção ExceptionB");
        } catch (ExceptionB e) {
            System.out.println("Capturado ExceptionB: " + e.getMessage());
        } catch (@SuppressWarnings("hiding") ExceptionA e) {
            System.out.println("Capturado ExceptionA: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Capturado Exception: " + e.getMessage());
        }
    }
}