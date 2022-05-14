package br.com.entra21.exercicioRepeticao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		byte option;

		do {
			System.out.println("1 - Calculando a soma");
			System.out.println("2 - Repetir 20 vezes");
			System.out.println("3 - Entre 20 pessoas exibir a soma das idades");
			System.out.println("4 - entre 20 pessoas exibir os maiores de idade");
			System.out.println("5 - Exibir mais novo");
			System.out.println("6 - ");
			System.out.println("7 -");
			System.out.println("8 - Exercicio08");
			System.out.println("0 - \"Sair");
			option = entrada.nextByte();
			switch (option) {

			case 0:
				System.out.println("O programa acabou");
				break;

			case 1:
				calculandoSoma();
				break;

			case 2:
				repetir20();
				break;

			case 3:
				sumAge();
				break;

			case 4:
				maioresIdade();
				break;

			case 5:
				exibirMaisNovo();
				break;
				
			case 6:
				
				break;
				
			case 7:
				
				break;
				
			case 8:
				exerciseOito();
				break;

			default:
				System.out.println("Escolha uma opção válida");
				break;

			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa:)");

	}

	public static void calculandoSoma() {
		System.out.println("Calculando a soma");

		int soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = Soma + Counter, " + soma + " = " + soma + " + " + counter + "==>" + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}

	public static void repetir20() {

		for (byte contador = 1; contador <= 20; contador++) {

			System.out.print("Eu gosto de algoritmos " + (contador % 5 == 0 ? "\n" : ""));

			if (contador % 5 == 0) {

				System.out.println("\n");
			}
		}

	}

	public static void sumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 5; count++) {
			System.out.println("No momento a soma está em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;
		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	public static void maioresIdade() {
		System.out.println("exibir apenas os maiores de idade");

		byte idade, contador;
		byte maiores = 0;
		Scanner entrada = new Scanner(System.in);

		for (contador = 1; contador <= 20; contador++) {
			System.out.println("Informe a idade da pessoa  " + contador);
			idade = entrada.nextByte();
			if (idade >= 18) {
				maiores++;
				System.out.println("A ultima pessoa informada era de maior");
			}

		}

		System.out.println("Entre " + (contador - 1) + " pessoas, apenas " + maiores + " são maiores de idade");

	}

	public static void exibirMaisNovo() {
		Scanner entrada = new Scanner(System.in);
		String name, youngerName = null;
		byte age, ageMinimal = 0;
		
		for(byte count=1; count<=10; count++) {
		
	
			System.out.println("Digite seu nome: ");
			name = entrada.nextLine();
			System.out.println(name+ " por favor, digite sua idade:");
			age = entrada.nextByte();
		 
			if(count ==1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro por isso sou o mais novo "+name);
			}else {
				
				
				if(age < ageMinimal) {
					System.out.println("Ainda bem que testei porque a pessoa mais nova é "+name+" com "+age+ " anos");
					ageMinimal = age;
					youngerName = name;
				}
			}
		}
		System.out.println("Após isso tudo o mais novo é: "+youngerName+" "+ageMinimal);
	}
	
	 public static void exerciseOito() {

		 

	        // Escreva um algoritmo que leia uma sequência de números do usuário e realize a
	        // soma desses números. Encerre a execução quando um número negativo for
	        // digitado.

	 

	        Scanner inPut = new Scanner(System.in);
	        int number, sum = 0; // se não inicializa um valor na váriavel ela fica com lixo da memória.

	 

	        do {

	 

	            System.out.println("What number do you want?");
	            number = inPut.nextInt();
	            if (number >= 0) {
	                sum = sum + number;
	            } // somente números positivos serão somados, ou números naturais.

	 

	        } while (number >= 0); // enquanto o número for maior que zero repita

	 

	        System.out.println("Your sum is: " + sum);

	 

	    }
}
