package Exercícios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Informe o primeiro número: ");
        int num2 = sc.nextInt();
        System.out.println("Informe o primeiro número: ");
        int num3 = sc.nextInt();

        if (num3 > num1 && num3 < num2 && num2 > num1){
            System.out.println(num3+" "+ num2+" "+ num1);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println(num2+" "+ num1+" "+ num3);
        } else if (num1 > num2 && num1 > num3 && num2> num3) {
            System.out.println(num1+" "+ num2+" "+ num3);
        } else if (num3 > num2 && num3 > num1 && num2 > num1) {
            System.out.println(num3+" "+ num2+" "+ num1);
        } else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println(num3+" "+ num1+" "+ num2);
        } else if (num1>num2 && num1>num3 && num3>num2) {
            System.out.println(num1+" "+ num3+" "+ num2);

        }
    }
}
