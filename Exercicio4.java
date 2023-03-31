package Exercícios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encerrar = false;
        double indice = sc.nextDouble();
        char opcao;
        double grupo;

        while (encerrar == false){
            System.out.println("Informe o índice de poluição: ");
            indice = sc.nextDouble();
            if (indice >= 0.05d && indice <= 0.25d){
                System.out.println("Parabéns!! \nÍndice de poluição aceitável");
            } else if (indice > 0.3d ) {
                System.out.println("Grupo 1 intimado. Pare todas as suas atividades");
                
            } else if (indice > 0.4d) {
                System.out.println("Grupo 1 e 2 intimado. Pare todas as suas atividades");
                
            } else if (indice > 0.5d ) {
                System.out.println("Grupo 1 e 2 e 3 intimados. Pare todas as suas atividades");
                
            }
            System.out.println("Deseja encerrar o programa? ");
            opcao = sc.next().charAt(0);
            if (opcao == 'S' || opcao == 's'){
                encerrar = true;
            }

        }

    }
}
