package atividade;

import java.util.Scanner;

public class Atividade09 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int codigo = sc.nextInt();
		
		if (codigo >= 1 && codigo <= 10) {
            System.out.println("Alimento não-perecível");
        } else if (codigo >= 11 && codigo <= 20) {
            System.out.println("Alimento perecível");
        } else if (codigo >= 21 && codigo <= 30) {
            System.out.println("Vestuário");
        } else if (codigo >= 31 && codigo <= 40) {
            System.out.println("Eletrônicos");
        } else {
            System.out.println("Código inválido");
        }

        sc.close();
		
	}
	
}
