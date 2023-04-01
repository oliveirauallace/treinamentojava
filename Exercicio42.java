package Exercícios;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encerrar = false;
        int numAtual, maior, menor;
        int opcao;

        System.out.println("Digite um número: ");
        numAtual = sc.nextInt();
        menor = numAtual;
        maior = numAtual;

        while (encerrar == false){
            System.out.print("Digite outro número: ");
            numAtual = sc.nextInt();

            if (numAtual > maior){
                maior = numAtual;

                } else if (numAtual < menor && numAtual !=0) {

                menor = numAtual;

                
            }
            System.out.println("\nO menor número é "+menor+" e o maior número é "+maior+".");
            System.out.println("Deseja continuar? ");
            opcao = sc.nextInt();
            if (opcao == 0) {
                encerrar = true;
        }


        }
    }
}
