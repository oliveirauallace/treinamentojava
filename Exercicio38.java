package Exercícios;
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean encerrar = false;
        char opcaoEncerramento;
        double N, E, HT, salario, SR;
        String C;

        while (encerrar == false){
            System.out.println("Informe o código: ");
            C = sc.next();
            System.out.println("Informe as horas trabalhadas: ");
            N = sc.nextDouble();
            System.out.println("Informe o salári: ");
            salario = sc.nextDouble();
            HT = N * 10;
            SR = salario + HT;
            if (HT >50){
                E = N *20;
                SR = salario + E;

                System.out.println("O salário do funcionário é: "+salario+"\ne o salário com reajuste é: "+SR);
            }
            System.out.println("Deseja enrerrar o programa?");
            opcaoEncerramento = sc.next().charAt(0);
            if (opcaoEncerramento == 'N' || opcaoEncerramento == 'n'){
                encerrar = true;

            }

        }

    }
}
