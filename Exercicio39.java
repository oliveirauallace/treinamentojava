package Exercícios;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encerrar = false;
        char decisao;
        double num;
        while (encerrar == false){
            System.out.println("Informe um número: ");
            num = sc.nextDouble();
            if (num %2 == 0 && num >0){
                System.out.println("O número "+ num + " é par e ma555ior que zero");
            } else if (num %2 != 0 && num >0) {
                System.out.println("O número "+ num + " é impar e ma555ior que zero");
            } else if (num %2 == 0 && num <0) {
                System.out.println("O número "+ num + " é par e menor que zero");
            } else if (num %2 != 0 && num <0) {
                System.out.println("O número "+ num + " é imnpar e menor que zero");
            }
            System.out.println("Deseja encerrar o programa? (S/N)");
            decisao = sc.next().charAt(0);
            if (decisao == 'S' || decisao == 's'){
                encerrar = true;
            }

        }
    }
}
