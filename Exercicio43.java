package Exercícios;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double graosporcasa =1, casasdotabuleiro = 64;
        int graos =1;
        for (int i = 1; i < casasdotabuleiro; i++) {
            graosporcasa = graosporcasa*2;
            graos += graosporcasa;

        }
        System.out.println("\nO quantidade de grãos é: "+graos);

    }
}
