package Exercícios;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAtual, maior, menor;

        System.out.println("Digite um número: (Número negativo encerra o programa)");
        numAtual = sc.nextInt();

        if (numAtual >0){
            menor = numAtual;
            maior = numAtual;
            while (numAtual>0){
                System.out.println("Digite outro número: ");
                numAtual = sc.nextInt();
                if (numAtual > maior){
                    maior = numAtual;

                } else if (numAtual < menor && numAtual >=0) {
                        menor = numAtual;

                    
                }
            }System.out.println("O maior número foi "+maior+" e o menor foi "+menor);
        }

    }
}
