package br.com.entra21.condicionalif;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Aprendendo sobre If");

		if (true) {
			System.out.println("Vai fazer isso quando der true");
			System.out.println("Somente true");
		}

		System.out.println("Aqui vai acontecer naturalmente pq o codigo segue sempre em frente");

		if (false) {
			// nunca passaria aqui pos apenas quando resulta em true pa
		}

		byte idade = 19;

		if (idade >= 18) {// [é maior de idade?
			System.out.println("é maior de idade");
		}

		if ((idade >= 13) && (idade < 18)) {
			System.out.println("é adolescente ");
		}

	}
}
