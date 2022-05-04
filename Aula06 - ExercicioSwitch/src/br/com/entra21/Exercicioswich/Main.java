package br.com.entra21.Exercicioswich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exiba em tela uma lista de opções para o usuário escolher "
				+ "e para cada escolha retornar uma mensagem diferente. ");
		
		System.out.println("Vamos começar? ");
		
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Verão ");
		 Scanner entrada = new Scanner(System.in);
		 byte opcao = 3;
		System.out.println("Qual sua estação do ano favorita?");
		opcao = entrada.nextByte();
		
		switch(opcao) {
	
		
	case 1:	
		System.out.println("Hmm a primavera é muito boa msm,e tbm mt bonita de se ver :D");
		break;

	case 2:
		System.out.println("A atmosfera de outono realmente é sem igual,e tbm mt bonita por conta de suas folhas :)");
		break;

	case 3:
		System.out.println("Inverno tbm é a minha favorita XD nada melhor doq um chocolate quente dentro de casa não é msm?");
		break;
		
	case 4:
		System.out.println("O verão é incrivelmente aconchegante,e bom para qm gosta de parques de diversão X)");
		break;
		}
		
		
		
		
	}

}
