package ex13;

public class IntegerSet {
    private boolean[] set;

    // Construtor sem argumento (inicializa como conjunto vazio)
    public IntegerSet() {
        set = new boolean[101];  // Array para armazenar inteiros de 0 a 100
    }

    // Método static para união de dois conjuntos
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < 101; i++) {
            result.set[i] = set1.set[i] || set2.set[i];  // true se presente em qualquer um dos conjuntos
        }
        return result;
    }

    // Método static para interseção de dois conjuntos
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < 101; i++) {
            result.set[i] = set1.set[i] && set2.set[i];  // true se presente em ambos os conjuntos
        }
        return result;
    }

    // Método para inserir um inteiro no conjunto
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    // Método para excluir um inteiro do conjunto
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    // Método para retornar uma representação do conjunto como string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < 101; i++) {
            if (set[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            return "---";  // Representação de conjunto vazio
        } else {
            return sb.toString();
        }
    }

    // Método para verificar se dois conjuntos são iguais
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < 101; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    // Método principal para testar a classe IntegerSet
    public static void main(String[] args) {
        // Criando dois conjuntos
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Inserindo elementos nos conjuntos
        set1.insertElement(1);
        set1.insertElement(5);
        set1.insertElement(10);

        set2.insertElement(5);
        set2.insertElement(10);
        set2.insertElement(15);

        // Imprimindo os conjuntos
        System.out.println("Conjunto 1: " + set1.toString());  // Esperado: 1 5 10
        System.out.println("Conjunto 2: " + set2.toString());  // Esperado: 5 10 15

        // Testando a união de dois conjuntos
        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("União de Conjunto 1 e Conjunto 2: " + unionSet.toString());  // Esperado: 1 5 10 15

        // Testando a interseção de dois conjuntos
        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Interseção de Conjunto 1 e Conjunto 2: " + intersectionSet.toString());  // Esperado: 5 10

        // Testando a exclusão de um elemento
        set1.deleteElement(1);
        System.out.println("Conjunto 1 após excluir o elemento 1: " + set1.toString());  // Esperado: 5 10

        // Testando se dois conjuntos são iguais
        System.out.println("Conjunto 1 é igual ao Conjunto 2? " + set1.isEqualTo(set2));  // Esperado: false

        // Testando a comparação com o conjunto de união
        System.out.println("Conjunto 1 é igual à união? " + set1.isEqualTo(unionSet));  // Esperado: false
    }
}
