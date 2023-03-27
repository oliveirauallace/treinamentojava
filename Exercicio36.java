package Exercícios;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAtual, maior, menor, med;

        System.out.println("Digite os números: ");
        numAtual = sc.nextInt();



        if (numAtual >0){
            maior = numAtual;
            menor = numAtual;
            while (numAtual >0){
                if (numAtual > maior){
                    maior = numAtual;
                }else if (numAtual < menor && numAtual >=0) {
                    menor = numAtual;
                }
                double md = numAtual/10;

                System.out.println(maior +" é o númerio Maior,"+menor+" é o número menor"+md);
            }

        }
    }
}
