package Exercícios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        int N1 = sc.nextInt();
        System.out.println("Informe a segunda nota: ");
        int N2 = sc.nextInt();
        System.out.println("Informe a terceira nota: ");
        int N3 = sc.nextInt();
        System.out.println("Informe a quarta nota: ");
        int N4 = sc.nextInt();

        int MD = (N1+N2+N3+N4)/4;

        if (MD >= 7) {
            System.out.println("Aluno Aprovado! Parabéns!!!");
        } else if (MD <7) {
            System.out.println("Aluno em recuperação. ");
            System.out.println("Informe a nota de recuperação: ");
            int REC = sc.nextInt();

            int NOVAMED = REC + MD;

            if (NOVAMED >=7){
                System.out.println("Aluno aprovado pela recuperação:  "+NOVAMED);
            }else {
                System.out.println("Aluno reprovado!");
            }

            
        }

    }
}
