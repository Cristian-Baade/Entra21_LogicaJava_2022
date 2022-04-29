package br.com.entra21.operadores.logicos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Operadores Lógicos");	
		
	System.out.println("E - AND - && = expressão restritiva");
	
	byte idade=19;
	float altura=1.8f;
	double dinheiro;
	boolean  resultado;
	
	resultado = idade<18;//false
	
	resultado = altura>=2.0f;//false
	
	resultado = (idade<18) && (altura>2.0f);
	//            (false)  &&    (false)   
	//                    false
	
	idade=15;
	altura=1.9f;
	
	resultado = (idade<18) && (altura>2.0f);
	//            (true)   &&    (false)
	//	                  false
	
	idade=20;
	altura=2.1f;
	dinheiro=20000;
	
	resultado = (idade>=18)  && (altura >=2.0f) && (dinheiro >=50000);
	//              (true)   &&    (true)       &&   (false)
	//                       (true)  &&  (false)
	//                              false 
	
	idade=30;
	altura=2.15f;
	dinheiro=100000;
	
	resultado = (idade>=18)  && (altura >=2.0f) && (dinheiro >=50000);
	//             (true|)    &&     (true)      &&   (true)
	//                           (true) && (true)
	//                                 true
	
	idade=40;
	altura=2.35f;
	dinheiro=100000;
		
	resultado = ( (idade>=18) && (idade<=45) )   && (altura<2.35f)   && (dinheiro>=50000);
	//          (     (true) && (true)       )   &&  (altura<2.35f)   && (dinheiro>=50000)                         
	//                 (true)         &&          (altura<2.35f)   && (dinheiro>=50000)
	//                   (true) && (false) && (dinheiro>=50000)
	//                   (true) && (false) && (true)
	//                          (false)
		
	
	//--------------------------------------------
	
	
	
	System.out.println("OU - OR - || - pipe - (SHIFT+\\) - (alt+124) = expressão inclusiva" );
	
	idade=17;
	dinheiro=1000;
	
	resultado = (idade>=18) || (dinheiro>=1000);//entrar na rave 7 dias no sitio
	//            (false)   ||  (dinheiro>=1000)
	//            (false)   ||  (true)
	//                   (true)
	
	resultado = (idade>=14) || (idade>=18);// melhor epoca para os pais
	//           (false) || (idade>=18)
	
	
		
	}

}
