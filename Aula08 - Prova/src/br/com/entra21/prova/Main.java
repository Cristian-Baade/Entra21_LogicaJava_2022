package br.com.entra21.prova;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        byte dia;
        
        //Usei o final byte para colocar o limite de dias de cada mes
		final byte diasJaneiro=31,diasFevereiro=28, diasMarco=31,diasAbril=30, diasMaio=31,diasJunho=30, 
				diasJulho=31, diasAgosto=31,diasSetembro=30, diasOutubro=31,diasNovembro=30, diasDezembro = 31;
		
		
		
		System.out.println("Crie um programa que informe o signo do usu�rio"
				+ "Capturar nome , dia e m�s de anivers�rio\r\n"
				+ "Criar constante para numero limite do dia do m�s, no caso 31");
		
		System.out.println("Digite seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Digite o dia do seu aniversario: ");
		dia = entrada.nextByte();
		
		System.out.println("Digite o mes de seu aniversario: ");
		String mes = entrada.next();	
		
	   System.out.println("Seu nome � "+nome);
	   System.out.println("Nasceu no dia "+dia+ " de " +mes);
		
	   
	   //Dependendo o mes informado o programa ira corresponder com o signo que tem em cada mes
		switch(mes) {
		case "1":
		case "janeiro":{
			if (dia>diasJaneiro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
			signoJaneiro(dia);
			
			}
			break;
			
			}
		case "2":
		case "fevereiro":{
			if (dia>diasFevereiro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoFevereiro(dia);
			}
			break;
			
			}	
		case "3":
		case "marco":{
			if (dia>diasMarco) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoMarco(dia);
			}
			break;
			
			}
		case "4":
		case "Abril":{
			if (dia>diasAbril) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoAbril(dia);
			}
			break;
			
			}
		case "5":
		case "Maio":{
			if (dia>diasMaio) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoMaio(dia);
			}
			break;
			
			}
		case "6":
		case "junho":{
			if (dia>diasJunho) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoJunho(dia);
			}
			break;
			
			}
		case "7":
		case "julho":{
			if (dia>diasJulho) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoJulho(dia);
			}
			break;
			
			}
		case "8":
		case "agosto":{
			if (dia>diasAgosto) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoAgosto(dia);
			}
			break;
			
			}
		case "9":
		case "setembro":{
			if (dia>diasSetembro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoSetembro(dia);
			}
			break;
			
			}
		case "10":
		case "outubro":{
			if (dia>diasOutubro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoOutubro(dia);
			}
			break;
			
			}
		case "11":
		case "novembro":{
			if (dia>diasNovembro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoNovembro(dia);
			}
			break;
			
			}
		case "12":
		case "dezembro":{
			if (dia>diasDezembro) {
				Invalido();
			}else if(dia<1) {
				saoNunca();
			}else {
				signoDezembro(dia);
			}
			break;
			
			}
		default:
			mesInvalido();
			break;
		}
		
		
			
		}

	    //Essas fun��es s�o para invalidar se a pessoa colocou um numero <1 ou um numero >31
		public static void Invalido() {
			System.out.println("Dia do mes invalido,tente novamente");
		}
		public static void saoNunca() {
			System.out.println("Famoso dia de s�o nunca :D");
		}
		public static void mesInvalido() {
			System.out.println("Mes invalido,tente novamente");
		}
		
		//Aqui eu coloquei cada signo referente ao mes
 		public static void signoJaneiro(byte dia) {
			if(dia<=20) {
				System.out.println("Voce � Capricornio!!!");
			}else if(dia>=21) {
				System.out.println("Voce � Aquario!!!");
}
}
		public static void signoFevereiro(byte dia) {
			if(dia<=18) {
				System.out.println("Voce � Aquario!!!");
			}else if (dia>=19) {
				System.out.println("Voce � Peixes!!!");
}	
}
		public static void signoMarco(byte dia) {
			if(dia<=20) {
				System.out.println("Voce � Peixes!!!");
			}else if (dia>=21) {
				System.out.println("Voce � Aries!!!");
}
}
		public static void signoAbril(byte dia) {
			if(dia<=20) {
				System.out.println("Voce � Aries!!!");
			}else if (dia>=21) {
				System.out.println("Voce � Touro!!!");
}
}
		public static void signoMaio(byte dia) {
			if(dia<=20) {
			    System.out.println("Voce � Touro!!!");
			}else if (dia>=21) {
				System.out.println("Voce � Gemeos!!!");
}
}
		public static void signoJunho(byte dia) {
			if(dia<=20) {
				System.out.println("Voce � Gemeos!!!");
			}else if (dia>=21) {
				System.out.println("Voce � Cancer!!!");
}
}
		public static void signoJulho(byte dia) {
			if(dia<=22) {
				System.out.println("Voce � Cancer!!!");
			}else if (dia>=23) {
				System.out.println("Voce � Le�o!!!");
}
}
		public static void signoAgosto(byte dia) {
			if(dia<=22) {
				System.out.println("Voce � Le�o!!!");
			}else if (dia>=23) {
				System.out.println("Voce � Virgem!!!");
}
}
		public static void signoSetembro(byte dia) {
			if(dia<=22) {
				System.out.println("Voce � Virgem!!!");
			}else if (dia>=23) {
				System.out.println("Voce � Libra!!!");
}
}
		public static void signoOutubro(byte dia) {
			if(dia<=22) {
				System.out.println("Voce � Libra!!!");
			}else if (dia>=23) {
				System.out.println("Voce � Escorpi�o!!!");
}
}
		public static void signoNovembro(byte dia) {
			if(dia<=21) {
				System.out.println("Voce � Escorpi�o!!!");
			}else if (dia>=22) {
				System.out.println("Voce � Sagit�rio!!!");
}
}
		public static void signoDezembro(byte dia) {
			if(dia<=21) {
				System.out.println("Voce � Sagit�rio!!!");
			}else if (dia>=22) {
				System.out.println("Voce � Capric�rnio!!!");
}
}
}