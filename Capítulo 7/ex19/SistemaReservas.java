package ex19;

import java.util.Scanner;

public class SistemaReservas {
    private static final boolean[] assentos = new boolean[10];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSistema de Reservas de Passagens Aéreas");
            System.out.println("1 - Primeira Classe (Assentos 1 a 5)");
            System.out.println("2 - Classe Econômica (Assentos 6 a 10)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (!reservarAssento(0, 5, "Primeira Classe")) {
                        oferecerAlternativa(5, 10, "Classe Econômica");
                    }
                    break;
                case 2:
                    if (!reservarAssento(5, 10, "Classe Econômica")) {
                        oferecerAlternativa(0, 5, "Primeira Classe");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static boolean reservarAssento(int inicio, int fim, String classe) {
        for (int i = inicio; i < fim; i++) {
            if (!assentos[i]) {
                assentos[i] = true;
                exibirCartaoEmbarque(i + 1, classe);
                return true;
            }
        }
        return false;
    }

    private static void oferecerAlternativa(int inicio, int fim, String classeAlternativa) {
        System.out.print(classeAlternativa + " está disponível. Aceita ser realocado? (s/n): ");
        char escolha = scanner.next().charAt(0);
        if (escolha == 's' || escolha == 'S') {
            if (!reservarAssento(inicio, fim, classeAlternativa)) {
                System.out.println("O próximo voo parte em 3 horas.");
            }
        } else {
            System.out.println("O próximo voo parte em 3 horas.");
        }
    }
  
    private static void exibirCartaoEmbarque(int assento, String classe) {
        System.out.println("\n============= CARTÃO DE EMBARQUE =============");
        System.out.println("Número do Assento: " + assento);
        System.out.println("Classe: " + classe);
        System.out.println("===========================================\n");
    }
}
