package Exercícios;

import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double opcao;
        boolean encerrar = false;
        char charOpcao;
        double resultado;
        double primeiro, segundo;

        while (encerrar == false){
            System.out.println("Digite uma das opções desejada, sendo: 1- Adição: 2 - Subtração: 3 - Multiplicação: 4 - Divisão");
            opcao = sc.nextDouble();
            if (opcao == 1){
                System.out.println("Informe o primeiro número: ");
                primeiro = sc.nextDouble();
                System.out.println("Informe o segundo número: ");
                segundo = sc.nextInt();
                resultado = primeiro + segundo;
                System.out.println("O Resultado de "+primeiro+" + "+segundo+" é: "+resultado);
            } else if (opcao ==2) {
                System.out.println("Informe o primeiro número: ");
                primeiro = sc.nextDouble();
                System.out.println("Informe o segundo número: ");
                segundo = sc.nextInt();
                resultado = primeiro - segundo;
                System.out.println("O Resultado de "+primeiro+" - "+segundo+" é: "+resultado);

            } else if (opcao == 3) {
                System.out.println("Informe o primeiro número: ");
                primeiro = sc.nextDouble();
                System.out.println("Informe o segundo número: ");
                segundo = sc.nextInt();
                resultado = primeiro / segundo;
                System.out.println("O Resultado de "+primeiro+" / "+segundo+" é: "+resultado);

            } else if (opcao == 4) {
                System.out.println("Informe o primeiro número: ");
                primeiro = sc.nextDouble();
                System.out.println("Informe o segundo número: ");
                segundo = sc.nextInt();
                resultado = primeiro * segundo;
                System.out.println("O Resultado de "+primeiro+" * "+segundo+" é: "+resultado);

            }else {
                System.out.println("Opção inválida, digite novamente o número");
                opcao = sc.nextDouble();
            }
            System.out.println("Deseja continuar? ");
            charOpcao = sc.next().charAt(0);
            if (charOpcao == 'N' || charOpcao == 'n'){
                encerrar = true;
            }

            }



    }
}
