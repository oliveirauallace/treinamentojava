package Exercícios;

import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Informe o Raio: ");
        float R = sc.nextFloat();
        System.out.println("Informe a altura: ");
        float A = sc.nextFloat();

        float V = 3.14159f * R * R * A;

        System.out.println("O volume da lata é: "+V);

    }
}
