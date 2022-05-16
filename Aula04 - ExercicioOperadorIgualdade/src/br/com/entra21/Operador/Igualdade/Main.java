package br.com.entra21.Operador.Igualdade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercicio sobre operador de igualdade");
		System.out.println("Faça um programa que compare 2 números e" + " informe se o 1º é igual ao 2º numero");

		byte idadeC, idadeD;
		boolean resultado;

		idadeC = 32;
		idadeD = 32;

		resultado = idadeC == idadeD;

		System.out.println("Ao comparar a igualdade resultou em " + resultado);

		// ---------------------------------------------------

		System.out.println("Faça um programa que compare 2 números e informe se o 1º é diferente do 2º numero");

		float alturaF = 2.05f, alturaE = 2.05f;

		resultado = alturaF != alturaE;

		System.out.println("Ao comparar a desigualdade resultou em " + resultado);

	}

}
