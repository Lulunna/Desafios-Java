package atividade;

import java.util.Scanner;

public class Atividade11 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O n�mero est� no intervalo de 10 a 20.");
        } else {
            System.out.println("O n�mero n�o est� no intervalo de 10 a 20.");
        }

        sc.close();
    }
}


