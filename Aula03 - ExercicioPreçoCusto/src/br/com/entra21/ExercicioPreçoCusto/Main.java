package br.com.entra21.ExercicioPreçoCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer, "
				+ "após, processe um aumento de 65% e informe qual será o preço de venda.");

		String nomeProduto;
		Float preçoVenda, preçoCusto;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();

		System.out.println("Qual o valor de custo do produto " + nomeProduto + " ?");
		preçoCusto = entrada.nextFloat();

		preçoVenda = preçoCusto + (preçoCusto * 65 / 100);

		System.out.println("O preço de venda é " + preçoVenda);

	}

}
