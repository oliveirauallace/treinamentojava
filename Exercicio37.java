package Exercícios;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int num1;
        int num2;
        int soma;
        String resposta;

        do {
            System.out.println("Seleicone as seguintes opções:");
            System.out.println("1 - Adição, 2 - Subtração, 3 - Multplicação, 4 - Divisão");
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.println("Informe o primeiro número: ");
                num1 = sc.nextInt();
                System.out.println("Informe o segundo número: ");
                num2 = sc.nextInt();
                soma = num1 + num2;

            }
            System.out.println(soma);
            System.out.println("Deseja fazer uma nova operação?");
            if (resposta == "S" || resposta == "s"){

            }

        }while ()
    }
}
