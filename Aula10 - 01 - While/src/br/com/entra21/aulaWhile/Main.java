package br.com.entra21.aulaWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("1 - while/n2 - do-while");
		
		// isntanciando um objeto da classe Scanner e ja utilizando o metodo next
		switch(new Scanner(System.in).next().toLowerCase()) {
		
		case "0", "sair" :
			System.out.println("Escolheu sair");
		break;
			
		case "1", "while" :
			aprenderWhile();
			break;
		
		case "2", "do-while":
			aprenderDoWhile();
			break;
		
		default:
			System.out.println("Opção Invalida");
			main(null);
			break;
		}
		
		
		}
		
		public static void aprenderWhile() {
			System.out.println("Vamos aprender While aqui");
			main(null);
		
	}
        public static void aprenderDoWhile() {
        	System.out.println("vamos aprender Do While aqui");
        	main(null);
}
}