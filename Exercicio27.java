package Exercícios;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de número que deve ser processado: ");
        int quantidade = sc.nextInt();

        long[] num = new long[quantidade];
        for (int x=0; x< num.length; x++){
            System.out.println("Digite um número");
            num [x] = sc.nextInt();
        }
        for (int x=0; x < num.length; x++){
            long resultado =1;
            for (long y=num[x]; y>0; y--){
                resultado = y* resultado;
            }
            System.out.println("O fatorial é: "+num[x]+" é: "+resultado);
        }

        
    }
}
