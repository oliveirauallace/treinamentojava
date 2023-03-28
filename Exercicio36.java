package Exercícios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeNum = 10;//Setando a quantidade dos números informados
        double media =0;
        int [] num = new int[quantidadeNum];

        for (int x = 0; x < quantidadeNum; x++) {
            System.out.println("Digite o "+(x+1)+"º número");
            num[x]= sc.nextInt();
            media += num[x];


        }
        media = media / quantidadeNum;
        Arrays.sort(num);
        System.out.println("O maior número é: "+num[0]);
        System.out.println("O menor número é: "+num[quantidadeNum -1]);
        System.out.println("A média dos números é: "+ media);


    }
}
