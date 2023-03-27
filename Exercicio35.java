package Exercícios;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisivel;

        for (int num = 0; num <=100 ; num++) {
            System.out.println(num);

            if (num %10 ==0){
                System.out.println(num);
            }

        }
    }
}
