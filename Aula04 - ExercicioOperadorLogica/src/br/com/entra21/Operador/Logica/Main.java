package br.com.entra21.Operador.Logica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Faça um programa que capture 3 informações o nome,  idade e altura."
				+ " Deve ser informado se o usuário é maior ou igual que 170cm E tem é maior de idade (utilizar o &&)");

		String nome;

		byte idadeA, idade = 14;
		float altura = 1.75f;
		boolean resultado;

		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("Qual seu nome? ");
		nome = entrada.nextLine();

		System.out.println(nome + ", " + idade + " anos e " + altura + "cm de altura ");

		System.out.println(altura >= 1.70f && idade > 18);

		// nome = Jaime;

		resultado = (altura >= 1.70f) && (idade > 18);
		// (true) && (false)
		// False

		// -----------------------------------------------

		System.out.println("Faça um programa que capture 3 informações o nome,  idade e altura."
				+ " Deve ser informado se o usuário é maior ou igual que 170cm OU tem é maior de idade (utilizar o ||)");

		// nome= Alessandro
		byte idadeB = 19;
		float alturaB = 1.69f;

		System.out.println("Qual seu nome? ");
		nome = entrada.nextLine();

		System.out.println(nome + ", " + idadeB + " anos e " + alturaB + "cm de altura ");

		System.out.println(altura >= 1.70f || idade > 18);

		resultado = (altura >= 1.70f) || (idade > 18);
		// (false) && (true)
		// true

		// -----------------------------------------------

	}

}
