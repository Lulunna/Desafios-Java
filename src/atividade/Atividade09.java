package atividade;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do produto: ");
		int codigo = sc.nextInt();
		
		if (codigo >= 1 && codigo <= 10) {
            System.out.println("Alimento n�o-perec�vel");
        } else if (codigo >= 11 && codigo <= 20) {
            System.out.println("Alimento perec�vel");
        } else if (codigo >= 21 && codigo <= 30) {
            System.out.println("Vestu�rio");
        } else if (codigo >= 31 && codigo <= 40) {
            System.out.println("Eletr�nicos");
        } else {
            System.out.println("C�digo inv�lido");
        }

        sc.close();
		
	}
	
}
