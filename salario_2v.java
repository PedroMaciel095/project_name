package Aula4_LPA;

import java.util.Scanner;

public class salario_2v {
	public static void main(String[] args) {
		Double horatrab, valorhora, salbruto, salliquido, inss;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Horas trabalhadas:");
		horatrab = ler.nextDouble();
		
		System.out.println("valor da hora trabalhada");
		valorhora = ler.nextDouble();
		
		System.out.println("salario liquido:");
		salliquido = ler.nextDouble();
		
		System.out.println("salario bruto é :" + horatrab * valorhora);
		salbruto = ler.nextDouble();
		
		System.out.println("Seu INSS é:" + salbruto * 0,12);
		inss = ler.nextDouble();
		
		System.out.println("Seu salário liquido é:" + salbruto - inss);
}
