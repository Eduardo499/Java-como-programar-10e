package ex12;

import java.util.Random;
import java.util.ArrayList;

public class Unico {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();

        while (numeros.size() < 5) {
            int num = rand.nextInt(91) + 10;

            if (!numeros.contains(num))
                numeros.add(num);
        }
        System.out.println(numeros);
    }
}
