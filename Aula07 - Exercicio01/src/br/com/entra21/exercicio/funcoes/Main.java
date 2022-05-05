package br.com.entra21.exercicio.funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Faça um programa de calculo");
        System.out.println("Capture 2 números e calcule a opção matemática correspondente");
		
        float numero1, numero2;
        
        Scanner entrada = new Scanner(System.in);
		String opcao;
        
		
		
		System.out.println("Decida qual operação quer realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		
		opcao = entrada.next();
		
		
		
		 System.out.println("Digite o primeiro numero: ");
	        numero1 = entrada.nextFloat();
		
	     System.out.println("Digite o segundo numero: ");
	        numero2 = entrada.nextFloat();
	        
	        
	        
	        
		switch(opcao.toLowerCase())  {
		case "1":
		case "soma":
			System.out.println("Resultado é "+somar(numero1, numero2));
		
	    	break;
		
		case "2":
		case "subtracao":
			System.out.println("Resultado é "+subtracao(numero1, numero2));
			
			break;
			
		case "3":
		case "divisao":
			System.out.println("Resultado é "+divisao(numero1, numero2));
			
    		break;
			
		case "4":
		case "multiplicacao":
			System.out.println("Resultado é "+multiplicacao(numero1, numero2));
			
			break;

			
          }
		
	
		}
	
		
		
	public static float somar(float numero1, float numero2){

	

		return numero1+numero2;

		}
	public static float subtracao(float numero1, float numero2){


		return numero1 - numero2;

		}
	public static float divisao (float numero1, float numero2){

		

		return numero1/numero2;

			}
	public static float multiplicacao(float numeroA, float numeroB){

		return numeroA * numeroB;

		}

        
	}
	





