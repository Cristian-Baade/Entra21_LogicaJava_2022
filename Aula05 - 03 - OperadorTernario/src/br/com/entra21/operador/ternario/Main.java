package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aprendendo sobre operador ternario");
	
	String nome;
	boolean condi��o=true;
	
	nome= (true) ? "nome": "Sobrenome";
	
	System.out.println("Ent�o vc � " + (condi��o? "de maior" : "de menor"));
	
	
	byte idade = 30;
	
	if( idade>17) {
		System.out.println("vc � de maior");
		
	}else {
		System.out.println("Vc � de menor");
	}
	
	System.out.println("vc � de "+ (idade>17?" de maior ":" de menor"));
	
	condi��o= (idade==30);
	
	
	}

}
