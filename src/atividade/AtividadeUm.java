package atividade;

import java.util.Scanner;

public class AtividadeUm {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
        
		if (numero % 2 == 0) {
        System.out.println(numero + " � um n�mero par");
        }
		
		else {
        System.out.println(numero + " � um n�mero �mpar");
       
        sc.close();
        }
	}
}
