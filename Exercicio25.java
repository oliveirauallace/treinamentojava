package Exercícios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu sexo: ");
        String sexo = sc.next();
        System.out.println("Informe a altura: ");
        float h = sc.nextFloat();

        if (sexo == "F"){
            float pesoideal = (62.1f *h) - 44.7f;
            System.out.println("O peso ideal é: "+pesoideal);
        } else if (sexo == "M") {
            float pesoideal = (72.7f*h) - 58f;
            System.out.println(pesoideal);

        }

    }
}
