package br.com.entra21.aula13.exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			// utilizando do-while, pois me peermite entrar no bloco antes de testar a
			// condi��o de peermanencia
			System.out.println("0 - Sair");
			System.out.println("1 - Criar vetores para cada tipo primitivo e exibir o tamanho deles no console");
			System.out.println(
					"2 - Criar vetores inicializados para cada tipo primitivo e exibir o tamanho deles no console");
			System.out.println("3 - Criar 1 vetor de 5 posi��es, para que o usu�rio alimente esses valores");
			System.out.println(
					"4 - Criar um vetor com o tamanho informado pelo usu�rio e depois solicitar que o usu�rio");
			System.out.println("5 - Criar um vetor de inteiros inicializado , para percorrer");
			System.out.println("6 - Criar um vetor de inteiros n�o inicializado");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Saiu");
				break;

			case 1:
				exibirTamanhoVetores();
				break;

			case 2:
				exibirTamanhoVetoresInicializados();
				break;

			case 3:
				vetorCom5ParaInicializar();
				break;

			case 4:
				definirTamanhoVetorParaInicializar();
				break;

			case 5:
				percorrerVetorInicializadoCrescenteDecrescente();
				break;

			case 6:

				break;

			default:
				break;
			}
			// caso a conddi��o de permaneencia seja true, repita o bloco
		} while (option != 0);// enquanto n�o for zero, repita

	}

	public static void exibirTamanhoVetores() {

		byte vetorBytes[] = new byte[1];
		short vetorShorts[] = new short[2];
		int vetorInts[] = new int[3];
		long vetorLongs[] = new long[4];
		char vetorChars[] = new char[5];
		float vetorFloats[] = new float[6];
		double vetorDoubles[] = new double[7];
		boolean vetorBooleans[] = new boolean[8];

		System.out.println("vetorBytes tamanha = " + vetorBytes.length);
		System.out.println("vetorShorts tamanha = " + vetorShorts.length);
		System.out.println("vetorInts tamanha = " + vetorInts.length);
		System.out.println("vetorLongs tamanha = " + vetorLongs.length);
		System.out.println("vetorChars tamanha = " + vetorChars.length);
		System.out.println("vetorFloats tamanha = " + vetorFloats.length);
		System.out.println("vetorDoubles tamanha = " + vetorDoubles.length);
		System.out.println("vetorBooleans tamanha = " + vetorBooleans.length);

	}

	public static void exibirTamanhoVetoresInicializados() {
		byte vetorBytes[] = { 5, 7, 9, 10 };
		short vetorShorts[] = { 140, 187, 195 };
		int vetorInts[] = { 1666, 1250 };
		long vetorLongs[] = { 100000, 200000, 300000 };
		float vetorFloats[] = { 10000.50f, 20000.2f, 50000.3f };
		double vetorDoubles[] = { 150000.354d, 400000.12345d };
		char vetorChars[] = { 'a', 'b', 'c', 'd', 'e' };
		boolean vetorBooleans[] = { true, false, false, true };

		System.out.println("vetorBytes tamanho =" + vetorBytes.length);
		System.out.println("vetorShorts tamanho =" + vetorShorts.length);
		System.out.println("vetorInts tamanho =" + vetorInts.length);
		System.out.println("vetorLongs tamanho=" + vetorLongs.length);
		System.out.println("vetorFloats tamanho=" + vetorFloats.length);
		System.out.println("vetorDoubles tamanho=" + vetorDoubles.length);
		System.out.println("vetorChars tamanho=" + vetorChars.length);
		System.out.println("vetorBooleans tamanho=" + vetorBooleans.length);
	}

	public static void vetorCom5ParaInicializar() {
		byte vetorBytes[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Inicializando a posi��o " + (count + 1) + " no indice " + count);
			vetorBytes[count] = input.nextByte();

		}

	}

	public static void definirTamanhoVetorParaInicializar() {
		Scanner entrada = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];
		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();
		vetorBytes = new byte[tamanho];
		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Informe o valor para o item " + (contador + 1) + " no �ndice [" + contador + "]");
			vetorBytes[contador] = entrada.nextByte();
		}
	}

	private static void percorrerVetorInicializadoCrescenteDecrescente() {
		byte vetorInt[] = { 12, 28, 37, 59, 6 };
		for (byte count = 0; count < vetorInt.length; count++) {
			System.out.println(vetorInt[count]);

		}
		System.out.println("----");
		for (byte count = (byte) (vetorInt.length - 1); count >= 0; count--) {
			// come�ando com o tamanho -1, pq o indice sempre tem um valor a menos
			// condi��o de permanencia, enquanto meu contado for maior que 0, comcei com
			// valor alto e pretendo para ao chegar no zero
			// como uma repeti��o decrescente utilizo o dcremento no contador
			System.out.println(vetorInt[count]);
		}
	}

	public static void exibirVetorInteirosNaoInicializado() {

		byte vetorBytes[] = new byte[10];
		Scanner entrada = new Scanner(System.in);
		String resposta;
		byte index = 0;

		do {
			System.out.println("Informe um valor para o indice [" + index + "]");
			vetorBytes[index] = entrada.nextByte();

			System.out.println("Gostaria de inicializar outro indice?");
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("sim")) {
				do {
					System.out.println("Informe um indice v�lido entre 0 e " + (vetorBytes.length - 1));
					index = entrada.nextByte();// Se o usuario digitar um valor valido esse index sera usado no meu DO
												// principal, onde a logica se repete

				} while (index < 0 || index >= vetorBytes.length);// A posicao escolhida nao pode ser menor do que 0 nem
																	// o tamanho do vetor ou superior
				// Exemplo: O range valido � de 0 a 9, qualquer numero alem disso fica preso
				// nesse loop

			}

		} while (resposta.equalsIgnoreCase("sim"));

		for (byte contador = 0; contador < vetorBytes.length; contador++) {

			System.out.println("vetorBytes[" + contador + "] = " + vetorBytes[contador]);

		}

	}

}