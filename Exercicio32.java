package Exercícios;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int resultado =0;


        do{
            System.out.println("Digite um número maior que zero e menor que 10");
            num = sc.nextInt();


        }while (num >=0 || num >=10);
        for (int x=num; x<4+num;x++){
            if (x%2==1){
                 resultado += x*x;

            }
        }
        System.out.println("O resultado da soma dos quadrados é: "+resultado);
    }
}
