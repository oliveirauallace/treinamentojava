package Exercícios;
import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade mínima: ");
        float QTDMIN = sc.nextFloat();
        System.out.println("Informe a quantidade Máxima: ");
        float QTDMAX = sc.nextFloat();

        float ESTMD = (QTDMIN+QTDMAX)/2;

        System.out.println("O Estoque Médio é: "+ESTMD);

    }
}
