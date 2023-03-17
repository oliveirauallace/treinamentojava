package Exercícios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número A: ");
        int A = sc.nextInt();
        System.out.println("Informe o número B: ");
        int B = sc.nextInt();
        int X;

        if (A >= B || A<B) {
            X = A;
            A = B;
            B = X;

        }
        System.out.println("O novo valor de A é: "+A+" e o novo valor de B é: "+B);
    }
}
