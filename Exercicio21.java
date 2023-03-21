package Exercícios;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Informe um número: ");
            num = sc.nextInt();
            if (num > 0){
                System.out.println("Positivo");
            }else {
                System.out.println("Negativo");
            }

        }while (num !=0);

    }

}
