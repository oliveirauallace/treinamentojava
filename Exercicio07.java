package Exercícios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit");
        float F = sc.nextFloat();

        float C = (F-32)*5/9;

        System.out.println("A temperatura em Gráus Célsios é: "+C);
    }
}
