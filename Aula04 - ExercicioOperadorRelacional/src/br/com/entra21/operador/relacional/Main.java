package br.com.entra21.operador.relacional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exercicio de Operador Relacional");
		System.out.println("Fa�a um programa que informe se o 1� numero � maior que o 2� numero");

		byte idadeA = 47, idadeB = 69;
		boolean resultado;

		resultado = idadeA > idadeB;

		System.out.println(idadeA + " � (>) que " + idadeB + " ? " + resultado);

		// -----------------------------------

		float pesoA = 73, pesoB = 72;

		System.out.println("Fa�a um programa que informe se o 1� numero � maior ou igual que o 2� numero");

		resultado = pesoA >= pesoB;

		System.out.println(pesoA + " � (>=) que " + pesoB + " ? " + resultado);

		// ------------------------------------

		int alturaA = 170, alturaB = 160;

		System.out.println("Fa�a um programa que informe se o 1� numero � menor que o 2� numero");

		resultado = alturaA < alturaB;

		System.out.println(alturaA + " � (<) que " + alturaB + " ? " + resultado);

		// -------------------------------------

		double MetroA = 7.05, MetroB = 7.05;

		System.out.println("Fa�a um programa que informe se o 1� numero � menor ou igual que o 2� numero");

		resultado = MetroA <= MetroB;

		System.out.println(MetroA + " � (<=) uqe " + MetroB + " ? " + resultado);

	}

}
