package Exercícios;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int adicao = num1+num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1/num2;

        System.out.println("Adição: "+adicao);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+ div);
    }
}
