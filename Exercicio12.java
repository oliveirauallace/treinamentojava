package Exercícios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        if (num <= 0){
            num = num *(-1);
            System.out.println("O módulo do número digitado é: "+num);
        }else {
            System.out.println("O módulo do número digitado é: "+num);
        }

    }
}
