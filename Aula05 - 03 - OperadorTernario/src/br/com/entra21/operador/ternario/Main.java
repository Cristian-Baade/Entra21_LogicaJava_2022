package br.com.entra21.operador.ternario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aprendendo sobre operador ternario");
	
	String nome;
	boolean condição=true;
	
	nome= (true) ? "nome": "Sobrenome";
	
	System.out.println("Então vc é " + (condição? "de maior" : "de menor"));
	
	
	byte idade = 30;
	
	if( idade>17) {
		System.out.println("vc é de maior");
		
	}else {
		System.out.println("Vc é de menor");
	}
	
	System.out.println("vc é de "+ (idade>17?" de maior ":" de menor"));
	
	condição= (idade==30);
	
	
	}

}
