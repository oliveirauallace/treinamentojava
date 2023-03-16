package Exercícios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro númer: ");
        int A = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int B = sc.nextInt();
        System.out.println("Informe o terceiro número");
        int C = sc.nextInt();
        System.out.println("Informe o quarto número: ");
        int D = sc.nextInt();

        //Adicionando soma
        int AB = A+B;
        int AC = A+C;
        int AD = A+D;
        int BC = B+C;
        int BD = B+D;
        int CD = C+D;

        int ABm = A*B;
        int ACm = A*C;
        int ADm = A*D;
        int BCm = B*C;
        int BDm = B*D;
        int CDm = C*D;

        System.out.println("Soma de A com B é: "+AB);
        System.out.println("Soma de A com C é: "+AC);
        System.out.println("Multiplicação de A com B é: "+ABm);
        System.out.println("Multiplicação de A com C é: "+ACm);
        System.out.println("-----------------------------------");
        System.out.println("Soma de A com D é: "+AD);
        System.out.println("Soma de B com C é: "+BC);
        System.out.println("Multiplicação de A com D é: "+ADm);
        System.out.println("Multiplicação de B com C é: "+BCm);
        System.out.println("-----------------------------------");
        System.out.println("Soma de B com D é: "+BD);
        System.out.println("Soma de C com D é: "+CD);
        System.out.println("Multiplicação de B com D é: "+BDm);
        System.out.println("Multiplicação de C com D é: "+CDm);





    }
}
