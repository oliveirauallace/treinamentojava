package Exercícios;
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =0;
        int QuantPar =0;
        int QuantImp =0;

        while (num>=0){

            System.out.println("Digite um número");
            System.out.println("Quando incluir um número negativo o sistema será finalizado");
            num = sc.nextInt();
            if (num%2==0){
                QuantPar++;
            } else {
                QuantImp++;

            }

        }
        System.out.println("Quantidade de Números Pares: "+QuantPar+" Quantidade de Números Impares: "+QuantImp);
    }
}
