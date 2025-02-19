package Aula4_LPA;

import java.util.Scanner;

public class salario_bruto {
	public static void main(String[] args) {
		
		]Double horatrab, valorhora, salbruto, salliquido, inss;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Horas trabalhadas:");
		horatrab = ler.nextDouble();
		
		System.out.println("valor da hora trabalhada:");
		valorhora = ler.nextDouble();
		
		salbruto = valorhora*horatrab;
		
		inss = salbruto * 0.12;
		System.out.println("Seu INSS é:" + inss);
		
		salliquido = salbruto-inss;
		
		System.out.println("Seu salário bruto é:" + salbruto);
		System.out.println("Seu salário liquido é:" + salliquido);
	}

}
