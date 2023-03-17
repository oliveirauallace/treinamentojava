package Exercícios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        float idade = sc.nextFloat();

        float idadeDias = idade * 365f;

        System.out.println("Sua idade em dias é: "+idadeDias);
    }
}
