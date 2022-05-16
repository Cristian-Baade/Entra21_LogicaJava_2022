package br.com.entra21.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome, cidade, idade, escolaridade, emprego, curso, experiencia;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Faça um programa que\r\n" + "Escreva as informações de um curriculum\r\n"
				+ "Cada etapa deve ter sua função separada");

		System.out.println("------------------------------------");
		System.out.println("Hora de fazermos o curriculum");

		Nome();
		nome = entrada.nextLine();

		idade();
		idade = entrada.nextLine();

		cidade();
		cidade = entrada.nextLine();

		escola();
		escolaridade = entrada.nextLine();

		curso();
		curso = entrada.nextLine();

		trabalho();
		emprego = entrada.nextLine();

		experiencia();
		experiencia = entrada.nextLine();

		System.out.println("---  FICHA PESSOAL  ---");
		System.out.println("   ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade/Estado: " + cidade);
		System.out.println();
		System.out.println("-  EXPERIENCIA E CURSOS  -");
		System.out.println("Escolaridade: " + escolaridade);
		System.out.println("Cursos: " + curso);
		System.out.println("Atualmente: " + emprego);
		System.out.println("Experiencia: " + experiencia);
		System.out.println("   ");
		System.out.println("------------------------");

	}

	public static void Nome() {
		System.out.println("Por favor diga-me o seu nome: ");

	}

	public static void idade() {
		System.out.println("Qual sua idade: ");

	}

	public static void cidade() {
		System.out.println("Me diga de que cidade/estado voce é: ");
	}

	public static void escola() {
		System.out.println("Qual seu grau de escolaridade: ");
	}

	public static void curso() {
		System.out.println("Diga-me,ja vez algum curso? ");
	}

	public static void trabalho() {
		System.out.println("esta trabalhando?");
	}

	public static void experiencia() {
		System.out.println("Ja teve experiencia em alguma area?");
	}
}
