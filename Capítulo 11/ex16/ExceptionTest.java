// Superclasse de exceção
class ExceptionA extends Exception {
    public ExceptionA(String message) {
        super(message);
    }
}

// Subclasse de ExceptionA
class ExceptionB extends ExceptionA {
    public ExceptionB(String message) {
        super(message);
    }
}

// Subclasse de ExceptionB
class ExceptionC extends ExceptionB {
    public ExceptionC(String message) {
        super(message);
    }
}

// Classe principal para teste
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionC("Exceção do tipo ExceptionC");
        } catch (ExceptionA e) {
            System.out.println("Capturada uma exceção: " + e.getMessage());
        }

        try {
            throw new ExceptionB("Exceção do tipo ExceptionB");
        } catch (ExceptionA e) {
            System.out.println("Capturada uma exceção: " + e.getMessage());
        }
    }
}