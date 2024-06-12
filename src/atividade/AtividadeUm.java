package atividade;

import java.util.Scanner;

public class AtividadeUm {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
        
		if (numero % 2 == 0) {
        System.out.println(numero + " é um número par");
        }
		
		else {
        System.out.println(numero + " é um número ímpar");
       
        sc.close();
        }
	}
}
