package br.com.entra21.exercicio.opinvalida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Escreva um menu de op��es e trate a situa��o "
				+ "onde o usu�rio n�o escolha uma op��o informada na lista ");
		

		System.out.println("1 = Bem");
		System.out.println("2 = Mal");
		System.out.println("3 = Sono");
	
		System.out.println("Ola, como esta se sentindo  hj?");

		String resposta;
		Scanner entrada = new Scanner(System.in);


		resposta = entrada.nextLine();
		switch(resposta) {

		case "bem":	
		    System.out.println("Que bom, ent tenha um bom dia :)");
		break;


		case "mal":
		    System.out.println("Ah , melhoras ai amigo :(");
		break;


		case "sono":
		    System.out.println("XD kkkk entendo, ent�o tenha um bom descanso ai");
		break;


		default:
		    System.out.println("Desculpe tente novamente,pois n�o entendi XD");
		break;
		
		}
	}

}
