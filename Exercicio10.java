package Exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2){
            System.out.println(num1+" e "+num2+"são iguais: ");
        } else if (num1 != num2) {
            System.out.println(num1+" e "+num2+"são diferentes ");
            
        } else if (num1 > num2) {
            System.out.println(num1+" é maior que "+num2);

        }else if (num1 < num2) {
            System.out.println(num1+" é menor que "+num2);

        }else if (num1 >= num2) {
            System.out.println(num1+" é maior ou igual "+num2);

        }else if (num1 <= num2) {
            System.out.println(num1+" é menor e igual que "+num2);

        }
    }
}
