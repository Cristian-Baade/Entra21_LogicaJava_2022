package br.com.entra21.aula05.exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Capturar 2 numeros e informar qual � o maior");

		Scanner entrada = new Scanner(System.in);
		byte numeroA, numeroB;

		System.out.println("informe o valor do numero A");
		numeroA = entrada.nextByte();

		System.out.println("informe o valor do numero B");
		numeroB = entrada.nextByte();

		if (numeroA > numeroB) {// 5 > 5
			System.out.println("NumeroA � maior");
		} else if (numeroA == numeroB) {
			System.out.println("S�o iguais");

		} else {
			System.out.println("NumeroB � maior");
		}

		System.out.println("=========================");

		System.out.println("Capturar ano de nascimento e informar se j� tem idade para votar");

		short anoNascimento;
		short calculo;

		System.out.println("Informe ano de nascimento");
		anoNascimento = entrada.nextShort();

		calculo = (short) (2022 - anoNascimento);

		if (calculo > 15) {
			System.out.println("Tem idade para votar");
		} else {
			System.out.println("Ta cedo ainda vai brincar");
		}

		System.out.println(calculo >= 16 ? "J� pode votar" : "N�o pode votar");

	}
}