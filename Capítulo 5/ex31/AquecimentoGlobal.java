package ex31;

import java.util.Scanner;

public class AquecimentoGlobal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acertos = 0;

        System.out.println("Perguntas sobre aquecimento global");

        System.out.println("1. O que é o efeito estufa?");
        System.out.println("a) Aumento da temperatura da Terra");
        System.out.println("b) Aumento da temperatura da Terra devido a poluição");
        System.out.println("c) Aumento da temperatura da Terra devido a poluição e gases estufa");
        System.out.println("d) Aumento da temperatura da Terra devido a gases estufa");

        System.out.print("Resposta: ");
        String resposta = scanner.nextLine();

        if (resposta.equals("c")) {
            acertos++;
        }

        System.out.println("2. Qual é o principal gás do efeito estufa?");
        System.out.println("a) Dióxido de carbono");
        System.out.println("b) Metano");
        System.out.println("c) Óxido nitroso");
        System.out.println("d) Clorofluorcarbonetos");

        System.out.print("Resposta: ");
        resposta = scanner.nextLine();

        if (resposta.equals("a")) {
            acertos++;
        }

        System.out.println("3. Qual é o principal fator do aquecimento global?");
        System.out.println("a) Aumento da temperatura da Terra");
        System.out.println("b) Aumento da temperatura da Terra devido a poluição");
        System.out.println("c) Aumento da temperatura da Terra devido a poluição e gases estufa");
        System.out.println("d) Aumento da temperatura da Terra devido a gases estufa");

        System.out.print("Resposta: ");
        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            acertos++;
        }

        System.out.println("4. Qual é o principal fator do aquecimento global?");
        System.out.println("a) Aumento da temperatura da Terra");
        System.out.println("b) Aumento da temperatura da Terra devido a poluição");
        System.out.println("c) Aumento da temperatura da Terra devido a poluição e gases estufa");
        System.out.println("d) Aumento da temperatura da Terra devido a gases estufa");

        System.out.print("Resposta: ");
        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            acertos++;
        }

        System.out.println("5. Qual é o principal fator do aquecimento global?");
        System.out.println("a) Aumento da temperatura da Terra");
        System.out.println("b) Aumento da temperatura da Terra devido a poluição");
        System.out.println("c) Aumento da temperatura da Terra devido a poluição e gases estufa");
        System.out.println("d) Aumento da temperatura da Terra devido a gases estufa");

        System.out.print("Resposta: ");
        resposta = scanner.nextLine();

        if (resposta.equals("d")) {
            acertos++;
        }

        System.out.println("Você acertou " + acertos + " de 5 perguntas.");

        switch (acertos) {
            case 0:
                System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
                break;
            case 1:
                System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
                break;
            case 2:
                System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
                break;
            case 3:
                System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
                break;
            case 4:
                System.out.println("Muito bom.");
                break;
            case 5:
                System.out.println("Excelente.");
                break;
        }

        scanner.close();
    }
}
