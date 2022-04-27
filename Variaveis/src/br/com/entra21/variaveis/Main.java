package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte idade;
		idade = 19;

		byte outraIdade = 20;

		short ano = 2022;

		short anoPassado;

		anoPassado = 2021;

		System.out.println("Minha idade é " + (idade + outraIdade));

		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil = 212060000;

		System.out.println("No Brasil em " + ano + " temos exatamente " +habitantesBrasil+ " habitantes");

		long habitantesTerra1500;
		habitantesTerra1500 = 790000000;
		
		double habitantesAtualmente = 790000000.00;
		
		float peso = 70.5f, altura= 1.72f;
		
		System.out.println("Meu peso é " +peso);
        System.out.println("Minha altura é " +altura);
        
        char letra= 'C';
		
        boolean intervaloAntesdasOito=false;
        boolean intervaloAgora=true;
        
        String nomeCompleto="";
        
       String nome;
       byte minhaIdade;
       float minhaAltura,salario;
       
       
       Scanner entrada;
       entrada = new Scanner(System.in);
      /* 
     System.out.println("Por favor qual é o seu nome?");
       nome = entrada.nextLine();
       
       System.out.println("informe a sua idade");
       minhaIdade = entrada.nextByte();
       
       System.out.println("Qual sua altura?");
       altura = entrada.nextFloat();
       
       System.out.println("Qual seu salário? por favor não minta");
      salario = entrada.nextFloat();
       
       System.out.println("Bem vindo " +nome+" agora consigo interagir com humanos e já sei que vc tem " +minhaIdade+" anos, tem " +altura+ "cm e ganha " +salario+ " de salario");
       */
       nome = JOptionPane.showInputDialog("Informe seu nome completo novamente");// syso + Scanner ao mesmo tempo
       
       JOptionPane.showMessageDialog(null,"Legal agora eu aprendi o seu nome "+ nome);
       
       minhaIdade = Byte.parseByte(
    		   JOptionPane.showInputDialog("Informe sua idade"));
        
    		   JOptionPane.showMessageDialog(null, "Hmm então sua idade é " +idade);
	
    		salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu salario?"));
    		   
    		  JOptionPane.showMessageDialog(null,"Seu salario é " +salario)
    		   ;


    		  
    		  final byte IDADE;
    		  idade=19;
    		  
    		  IDADE=29;
    		  
	}
	

}
