package atividade;

import java.util.Scanner;

public class AtividadeDois {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um n�mero: ");
	int numero = sc.nextInt();
	
	if (numero >0) {
	 System.out.println(numero + " � um n�mero positivo");
	}
	
	else if (numero <0) {
	 System.out.println(numero + " � um n�mero negativo");
	}
	
	else {
	 System.out.println("O n�mero � zero");
	
	  sc.close();	

	}
  }
 }
