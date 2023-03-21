package Exercícios;

import java.util.Scanner;
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int A = sc.nextInt();
        System.out.println("informe o segundo valor: ");
        int B = sc.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int C = sc.nextInt();

        if (A < B+C){
            if (A==B && A == C){
                System.out.println("Triangulo Equilátero");
            } else if (A ==B || A==C || B ==C) {
                System.out.println("Triangulo isórceles");

            }else {
                System.out.println("Triangulo escaleno");
            }
        }else {
            System.out.println("Não se caracteriza um triangulo");
        }

    }
}
