package Exercícios;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int num;
        int num1;


        do {
            System.out.println("Informe o primeiro número: ");
            num = sc.nextInt();
            System.out.println("Informe o segundo número: ");
            num1 = sc.nextInt();


            System.out.println("O que deseja realizar? ");
            System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro");
            System.out.println("2 – Verificar se os dois números lidos são pares");
            System.out.println("3 – Verificar se a média dos dois números é maior ou igual a 7. ");
            System.out.println("4 – Sair ");
            opcao = sc.nextInt();
            if (opcao == 1){
                if (num /num1 == 0){
                    System.out.println(num+" é múltiplo de "+num1);
                } else if (num1/num ==0) {
                    System.out.println(num1+" é múltiplo de "+num);
                    
                }
            } else if (opcao == 2) {
                int soma = num+num1;
               if (soma %2==0){
                   System.out.println("Este número é par");
               }else {
                   System.out.println("Este número não é par");
               }
                
            } else if (num+num1/2>7) {
                System.out.println("É maior que 7");
            }else {
                System.out.println("É menor que 7");
            }

        }while (opcao !=3);


    }
}
