package br.com.entra21.ExercicioPre�oCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer, "
				+ "ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");

		String nomeProduto;
		Float pre�oVenda, pre�oCusto;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o nome do produto?");
		nomeProduto = entrada.nextLine();

		System.out.println("Qual o valor de custo do produto " + nomeProduto + " ?");
		pre�oCusto = entrada.nextFloat();

		pre�oVenda = pre�oCusto + (pre�oCusto * 65 / 100);

		System.out.println("O pre�o de venda � " + pre�oVenda);

	}

}
