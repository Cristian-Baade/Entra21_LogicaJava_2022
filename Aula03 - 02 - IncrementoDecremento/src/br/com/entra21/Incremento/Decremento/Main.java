package br.com.entra21.Incremento.Decremento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 19;

		idade -= 10;// idade = idade - 10
		// idade = 19-10
		// 9
		System.out.println("Minha idade com pre incremento " + (++idade));
		System.out.println("E agora ?" + idade);

		idade = idade + 1; // 20
		System.out.println(idade);

		// ano 29/2 4 em 4 anos

		idade = idade + 4;
		System.out.println(idade);

		idade++;
		System.out.println(idade);

		idade += 2;
		System.out.println(idade);

		idade = idade + 2;
		System.out.println(idade);

		idade *= 2;
		System.out.println(idade);

		idade = idade * 2;
		System.out.println(idade);

		idade /= 2;
		System.out.println(idade);

		idade = idade / 2;
		System.out.println(idade);

		idade--;
		System.out.println(idade);

		idade -= 10;
		System.out.println(idade);

		idade = idade - 10;
		System.out.println(idade);

	}

}
