package Exercícios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a cotação do dólar: ");
        float cotacao = sc.nextFloat();
        System.out.println("Informe o valor que você tem em dolar: ");
        float valor = sc.nextFloat();

        float real = valor*cotacao;

        System.out.println(real);
    }
}
