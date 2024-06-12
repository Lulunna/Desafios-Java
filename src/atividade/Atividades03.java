package atividade;

import java.util.Scanner;  

public class Atividades03 {
	public static void 	main (String[]args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("digite um número: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " É maior que " + numero2);
		}
		
		else if (numero2 > numero1) {
			System.out.println(numero2 + " É maior que " + numero1);
		}
		
		else {
			System.out.println("Os número são iguais");
		
			sc.close();
			
		}
		
	}

}
