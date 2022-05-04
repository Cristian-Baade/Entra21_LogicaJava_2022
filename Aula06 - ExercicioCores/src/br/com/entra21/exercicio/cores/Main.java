package br.com.entra21.exercicio.cores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Com o mesmo formato do exercício 1 , "
		+ "agora aceite apenas String como resposta");

System.out.println("Vamos dar inicio");

System.out.println("1 = Verde");
System.out.println("2 = Azul");
System.out.println("3 = Amarelo");
System.out.println("4 = Vermelho");

System.out.println("Qual sua cor favorita?");

String resposta;
Scanner entrada = new Scanner(System.in);


resposta = entrada.nextLine().toString().toLowerCase();
switch(resposta) {

case "verde":	
    System.out.println("A cor que significa a vida,uma cor legal e bem viva :)");
break;


case "azul":
    System.out.println("A cor dos oceanos,bonita e bem profunda não é mesmo?");
break;


case "amarelo":
    System.out.println("A cor da felicidade! uma cor que exala alegria onde ela estiver,é uma cor bem divertida X)");
break;


case "vermelho":
    System.out.println("Hmm a minha cor favorita XD tbm relacionada a paixão e ao perigo,uma cor realmente tentadora para qm a vê");
break;
}
	}
}
