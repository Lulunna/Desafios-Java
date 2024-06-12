package atividade;

import java.util.Scanner;

public class Atividade07 {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a ideide: ");
		int idade = sc.nextInt();
		
		if (idade >= 0 && idade <=12) {
			System.out.println("Criança");
		}
		
		else if (idade >=13 && idade <= 17) {
			System.out.println("Adolecente");
		}
		
		else if (idade >=18 && idade <= 59) {
			System.out.println("Adulto");
		}
		
		else {
			System.out.println("Idoso");
		}
		
		sc.close();
	}

}
