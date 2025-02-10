package ex21;

public class ExceptionScopeDemo {
    public static void methodWithTry() throws Exception {
        try {
            throw new Exception("Exceção em methodWithTry");
        } finally {
            System.out.println("Finalizando methodWithTry");
        }
    }

    public static void main(String[] args) {
        try {
            methodWithTry();
        } catch (Exception e) {
            System.out.println("Exceção capturada no escopo externo: " + e.getMessage());
        }
    }
}