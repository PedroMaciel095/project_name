package Aula4_LPA;

import java.util.Scanner;

public class identificação_nome {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe seu nome : ");
		nome = ler.next();
		System.out.println("Informe seu sobrenome : ");
		sobrenome = ler.next();
		System.out.println("Seu nome é:" + nome + "   " + sobrenome);
		
	}

}
