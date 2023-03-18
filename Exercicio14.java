package Exercícios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o primeiro número: ");
        int num2 = sc.nextInt();
        if (num1 > num2){
            int dif = num1-num2;
            System.out.println("A diferença entre o número 1 e o número 2 digitados é: "+dif);
        }else {
            int dif = num2-num1;
            System.out.println("A diferença entre o número 2 e o número 1 digitados é: "+dif);

        }

    }
}
