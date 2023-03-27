package Exercícios;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int num = 1; num <=100 ; num++) {
            if (num % 10 == 0) {
                System.out.println(num + " é multiplo de 10");
            } else {
                System.out.println(num);

            }
        }
    }
}
