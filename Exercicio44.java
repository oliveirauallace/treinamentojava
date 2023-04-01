package Exercícios;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean encerrar = false;
        double opcao;
        char questao;

        while (encerrar == false){
            System.out.println("Selecione a opção desejada: \n 1 – Conversão de Graus Celsius em Graus Fahrenheit\n" +
                    "2 – Conversão de Graus Fahrenheit em Graus Celsius\n" +
                    "3 – Peso ideal do homem\n" +
                    "4 – Peso ideal da mulher\n");
            opcao = sc.nextDouble();
            if (opcao ==1){
                System.out.println("Digite a temperatura em Gráus Célsios");
                float c = sc.nextFloat();

                float F = (9*c+160)/5;

                System.out.println("A temperatura em Fahrenheit é: "+F);

            } else if (opcao ==2) {
                System.out.println("Digite a temperatura em Fahrenheit");
                float F = sc.nextFloat();

                float C = (F-32)*5/9;

                System.out.println("A temperatura em Gráus Célsios é: "+C);

            } else if (opcao == 3) {
                System.out.println("Informe a altura: ");
                float h = sc.nextFloat();
                float pesoideal = (72.7f*h) - 58f;
                System.out.println("O peso ideaL É: "+pesoideal);
                
            } else if (opcao ==4) {
                System.out.println("Informe a altura: ");
                float h = sc.nextFloat();
                float pesoideal = (62.1f *h) - 44.7f;
                System.out.println("O peso ideal é: "+pesoideal);
                
            }
            System.out.println("Deseja continuar? ");
            questao = sc.next().charAt(0);
            if (questao == 'N' || questao == 'n') {
                encerrar = true;
            }
        }
    }
}
