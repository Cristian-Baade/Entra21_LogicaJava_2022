package br.com.entra21.aulaswitch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Condicionais - switch");
		
System.out.println("serve para escolher entre op�~eos pr� definidas");
	
System.out.println("Geralmente quando h� muitos if elses ifs baseados em igualdade");	
	

float altura= 1.5f;

if(altura== 1.0) {
	System.out.println("� baixinho");
}else if(altura ==1.2) {
	System.out.println("continua baixinho");
}else if(altura == 1.5) {
	System.out.println("Baixinho mas nem tanto");
}else {
	System.out.println("j� n�o � considerado baixinho");	
}
System.out.println("1 = Intervalo");
System.out.println("2 = Exercicio");
System.out.println("3 = Prova");
Scanner entrada = new Scanner(System.in);
byte opcao=3;	
System.out.println("Escolha a op 3 se tiver coragem");
opcao = entrada.nextByte();

switch(opcao) {
case 1:
	System.out.println("Vamos p�ra o intervalo");
	break;

case 2:
	System.out.println("Daqui a pouco tem exercicio");
	break;

case 3:
	System.out.println("Era dia 5 mas podemos fazer hj");
	break;
}

String resposta;

System.out.println("Queremos intervalo?");
resposta = entrada.nextLine();

switch(resposta) {

case "sim":
	System.out.println("Hj foi na HR");
	break;
	
case "n�o":	
    System.out.println("Esperar mais um pouco");
    break;

    default:
    	System.out.println("era uma pergunta t�o simples...");
    break;	
    
    
}
	}
	
}
