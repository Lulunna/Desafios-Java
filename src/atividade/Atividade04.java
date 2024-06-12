package atividade;

import java.util.Scanner;

public class Atividade04 {
	
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o comprimento do primeiro lado do tri�ngulo: ");
	double lado1 = sc.nextDouble();
	
	System.out.println("Digite o comprimento do segundo lado: ");
	double lado2 = sc.nextDouble();
	
	System.out.println("Digite o comprimeiro do terceio lado: ");
	double lado3 = sc.nextDouble();
	
	if (Triangulo(lado1, lado2, lado3)) {
        System.out.println("Os lados fornecidos formam um tri�ngulo v�lido.");
    } else {
        System.out.println("Os lados fornecidos n�o formam um tri�ngulo v�lido.");
    }

    sc.close();
}

   public static boolean Triangulo(double lado1, double lado2, double lado3) {

	return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

   }
}

