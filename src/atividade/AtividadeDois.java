package atividade;

import java.util.Scanner;

public class AtividadeDois {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int numero = sc.nextInt();
	
	if (numero >0) {
	 System.out.println(numero + " é um número positivo");
	}
	
	else if (numero <0) {
	 System.out.println(numero + " é um número negativo");
	}
	
	else {
	 System.out.println("O número é zero");
	
	  sc.close();	

	}
  }
 }
