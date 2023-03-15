package Exercícios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do vendedor: ");
        String nome = sc.next();
        System.out.print("Informe o código da peça: ");
        int peca = sc.nextInt();
        System.out.print("Informe o preço unitário da peça: ");
        float preco = sc.nextFloat();
        System.out.print("Informe a quantidade de peças vendida: ");
        float qtd = sc.nextFloat();

        float valor_vendido = preco * qtd;

        float comissao = valor_vendido * 0.05f;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("vendedor: "+nome);
        System.out.println("Código da Peça: "+peca);
        System.out.println("Preço da peça:"+preco);
        System.out.println("Quantidade de peças: "+qtd);
        System.out.println("O valor da venda foi: "+valor_vendido+" e a comissão adquirida foi: "+comissao);


    }
}
