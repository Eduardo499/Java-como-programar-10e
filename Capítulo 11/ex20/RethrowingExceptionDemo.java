package ex20;

public class RethrowingExceptionDemo {
    public static void someMethod2() throws Exception {
        throw new Exception("Exceção em someMethod2");
    }
    
    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Exceção capturada em someMethod, relançando...");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}