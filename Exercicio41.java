package Exercícios;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encerrar = false;
        char opcao;
        double idade;
        while (encerrar == false){
            System.out.println("Informe a idade do nadador: ");
            idade = sc.nextDouble();
            if (idade >= 5 && idade <=7){
                System.out.println("O participante está na categoria infantil A: ");
            } else if (idade >= 8 && idade <=11) {
                System.out.println("O participante está na categoria infantil B");
            } else if (idade >= 12 && idade <=13) {
                System.out.println("O participante está na categoria juvenil C");
            } else if (idade >= 13 && idade <=17) {
                System.out.println("O participante está na categoria juvenil D");
            }else {
                System.out.println("O participante está na categoria Adulto E");
            }
            System.out.println("Deseja continuar? ");
            opcao = sc.next().charAt(0);
            if (opcao == 'S' || opcao == 's') {
                encerrar = true;
            }

        }
    }
}
