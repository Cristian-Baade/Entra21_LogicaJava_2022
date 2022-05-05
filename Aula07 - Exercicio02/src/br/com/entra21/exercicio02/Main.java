package br.com.entra21.exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  nome, cidade, idade, escolaridade, emprego, curso;
		Scanner entrada = new Scanner(System.in);
		
		inicio();
		
		Nome();
		nome = entrada.nextLine();
		
		System.out.println("Qual sua idade: ");
		idade = entrada.nextLine();
		
		System.out.println("Me diga de que cidade/estado voce é: ");
		cidade = entrada.nextLine();
		
		System.out.println("Qual seu grau de escolaridade: ");
		escolaridade = entrada.nextLine();
	
		System.out.println("esta trabalhando?");
		emprego = entrada.nextLine();
		
		System.out.println("---  FICHA PESSOAL  ---");
		System.out.println("   ");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Cidade/Estado: "+cidade);
		System.out.println("Escolaridade: "+escolaridade);
		System.out.println("Emprego Atual: "+emprego);
		System.out.println("   ");
 	    System.out.println("------------------------");
 	    
	}
	public static void inicio() {
		System.out.println("Faça um programa que\r\n"
				+ "Escreva as informações de um curriculum\r\n"
				+ "Cada etapa deve ter sua função separada");
		
		System.out.println("------------------------------------");
		System.out.println("Hora de fazermos o curriculum");
	}


    public static void Nome() {
    	System.out.println("Por favor diga-me o seu nome: ");
		
    }
    }
