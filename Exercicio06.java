package Exercícios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Gráus Célsios");
        float c = sc.nextFloat();

        float F = (9*c+160)/5;

        System.out.println("A temperatura em Fahrenheit é: "+F);


    }
}
