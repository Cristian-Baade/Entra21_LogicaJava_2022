package br.com.entra21.operador.relacional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercicio de Operador Relacional");
		System.out.println("Faça um programa que informe se o 1º numero é maior que o 2º numero");

		byte idadeA = 47, idadeB = 69;
		boolean resultado;

		resultado = idadeA > idadeB;

		System.out.println(idadeA + " é (>) que " + idadeB + " ? " + resultado);

		// -----------------------------------

		float pesoA = 73, pesoB = 72;

		System.out.println("Faça um programa que informe se o 1º numero é maior ou igual que o 2º numero");

		resultado = pesoA >= pesoB;

		System.out.println(pesoA + " é (>=) que " + pesoB + " ? " + resultado);

		// ------------------------------------

		int alturaA = 170, alturaB = 160;

		System.out.println("Faça um programa que informe se o 1º numero é menor que o 2º numero");

		resultado = alturaA < alturaB;

		System.out.println(alturaA + " é (<) que " + alturaB + " ? " + resultado);

		// -------------------------------------

		double MetroA = 7.05, MetroB = 7.05;

		System.out.println("Faça um programa que informe se o 1º numero é menor ou igual que o 2º numero");

		resultado = MetroA <= MetroB;

		System.out.println(MetroA + " é (<=) uqe " + MetroB + " ? " + resultado);

	}

}
