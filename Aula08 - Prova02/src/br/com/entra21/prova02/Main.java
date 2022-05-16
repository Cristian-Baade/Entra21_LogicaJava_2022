package br.com.entra21.prova02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Crie um programa que faça vários cálculos\r\n"
				+ "Informe qual operação matemática deseja realizar\r\n" + "caso informe 0 deve encerrar o programa");

		calculadora();

	}

	// Aqui é onde o programa vai quando ele for somar,subtrair,multiplicar e etc...
	public static float somar(float numero1, float numero2) {

		return numero1 + numero2;

	}

	public static float subtracao(float numero1, float numero2) {

		return numero1 - numero2;

	}

	public static float divisao(float numero1, float numero2) {

		return numero1 / numero2;

	}

	public static float multiplicacao(float numeroA, float numeroB) {

		return numeroA * numeroB;

	}

	public static void calculadora() {
		float numero1, numero2;

		Scanner entrada = new Scanner(System.in);
		String resultado;

		// Operações Matematicas que o codigo rodara
		System.out.println();
		System.out.println("Decida qual operação quer realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("0 - Encerrar");

		resultado = entrada.next();

		// Quando o usuario escolher alguma das operações,o programa entrara aqui para
		// executar o pedido dos numeros
		// e ir para a função do calculo desejado
		switch (resultado.toLowerCase()) {
		case "1":
		case "soma":
			System.out.println("Digite o primeiro numero: ");
			numero1 = entrada.nextFloat();

			System.out.println("Digite o segundo numero: ");
			numero2 = entrada.nextFloat();

			System.out.println("Resultado é " + somar(numero1, numero2));
			calculadora();
			break;

		case "2":
		case "subtracao":
			System.out.println("Digite o primeiro numero: ");
			numero1 = entrada.nextFloat();

			System.out.println("Digite o segundo numero: ");
			numero2 = entrada.nextFloat();

			System.out.println("Resultado é " + subtracao(numero1, numero2));
			calculadora();
			break;

		case "3":
		case "divisao":
			System.out.println("Digite o primeiro numero: ");
			numero1 = entrada.nextFloat();

			System.out.println("Digite o segundo numero: ");
			numero2 = entrada.nextFloat();

			System.out.println("Resultado é " + divisao(numero1, numero2));
			calculadora();
			break;

		case "4":
		case "multiplicacao":
			System.out.println("Digite o primeiro numero: ");
			numero1 = entrada.nextFloat();

			System.out.println("Digite o segundo numero: ");
			numero2 = entrada.nextFloat();

			System.out.println("Resultado é " + multiplicacao(numero1, numero2));
			calculadora();
			break;

		case "0":
		case "encerrar":
			System.out.println("O programa foi encerrado");
			break;
		}
	}
}
