package Exercícios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int N1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int N2 = sc.nextInt();

        if (N1 > N2){
            System.out.println(N1+" Maior que "+N2);
        } else if (N1<N2) {
            System.out.println(N1+" Menor que "+N2);

        }else {
            System.out.println(N1+" São Iguais "+N2);
        }

    }
}
