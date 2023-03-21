package Exercícios;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do{
            System.out.println("Informe um número: ");
            num = sc.nextInt();
            if (num >0){
                int positivo = num;
                System.out.println("Número positivo: "+positivo);
            }else {
                int negativo = num;
                System.out.println("Número negativo: "+negativo);
            }
        }while (num != 0);

    }
}
