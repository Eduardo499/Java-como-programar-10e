package ex19;

class SomeClass {
    public SomeClass() throws Exception {
        throw new Exception("Erro no construtor de SomeClass");
    }
}

public class ConstructorFailureDemo {
    public static void main(String[] args) {
        try {
            // SomeClass obj = new SomeClass();
        } catch (Exception e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}