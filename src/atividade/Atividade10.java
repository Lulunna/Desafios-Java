package atividade;

import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro n�mero:");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo n�mero:");
        double numero2 = sc.nextDouble();

        System.out.println("Digite a opera��o (adi��o, subtra��o, multiplica��o ou divis�o):");
        String operacao = sc.next();

        double resultado = 0;

        
        if (operacao.equals("adi��o")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("subtra��o")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("multiplica��o")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("divis�o")) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Opera��o inv�lida");
            return;
        }

        System.out.println("Resultado da " + operacao + ": " + resultado);

        sc.close();
    }
}