package Exercícios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int NUM = sc.nextInt();

        if (NUM >=0 && NUM <=9){
            System.out.println("Valor válido");
        }else {
            System.out.println("Valor inválido");
        }
    }
}
