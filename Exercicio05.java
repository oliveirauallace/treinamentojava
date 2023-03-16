package Exercícios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tempo da viagem: ");
        float tempo = sc.nextFloat();
        System.out.print("informe a velocidade média percorrida: ");
        float velocidade = sc.nextFloat();

        float distancia = tempo * velocidade;
        float litros_usados = distancia / 12;


        System.out.println("A Velocidade média é: "+velocidade);
        System.out.println("O tempo de viagem foi: "+tempo);
        System.out.println("A distância percorrida foi: "+distancia);
        System.out.println("A quantidade de Lítros usados foi: "+litros_usados);

    }
}
