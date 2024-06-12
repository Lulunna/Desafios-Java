package atividade;

import java.util.Scanner;

public class Atividade10 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = sc.nextDouble();

        System.out.println("Digite a operação (adição, subtração, multiplicação ou divisão):");
        String operacao = sc.next();

        double resultado = 0;

        
        if (operacao.equals("adição")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("subtração")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("multiplicação")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("divisão")) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Operação inválida");
            return;
        }

        System.out.println("Resultado da " + operacao + ": " + resultado);

        sc.close();
    }
}