package br.com.entra21.Exercicioswich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Exiba em tela uma lista de op��es para o usu�rio escolher "
				+ "e para cada escolha retornar uma mensagem diferente. ");
		
		System.out.println("Vamos come�ar? ");
		
		System.out.println("1 = Primavera");
		System.out.println("2 = Outono");
		System.out.println("3 = Inverno");
		System.out.println("4 = Ver�o ");
		 Scanner entrada = new Scanner(System.in);
		 byte opcao = 3;
		System.out.println("Qual sua esta��o do ano favorita?");
		opcao = entrada.nextByte();
		
		switch(opcao) {
	
		
	case 1:	
		System.out.println("Hmm a primavera � muito boa msm,e tbm mt bonita de se ver :D");
		break;

	case 2:
		System.out.println("A atmosfera de outono realmente � sem igual,e tbm mt bonita por conta de suas folhas :)");
		break;

	case 3:
		System.out.println("Inverno tbm � a minha favorita XD nada melhor doq um chocolate quente dentro de casa n�o � msm?");
		break;
		
	case 4:
		System.out.println("O ver�o � incrivelmente aconchegante,e bom para qm gosta de parques de divers�o X)");
		break;
		}
		
		
		
		
	}

}
