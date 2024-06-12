package atividade;

import java.util.Scanner;

public class Atividade05 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota do aluno: ");
	double nota1 = sc.nextInt();
	
	System.out.println("Digite a segunda nota do aluno: ");
	double nota2 = sc.nextInt();
	
	System.out.println("Digite a terceira nota do aluno: ");
	double nota3 = sc.nextInt();
	
	double media = (nota1 + nota2 + nota3) /3;
	
	if (media >=7) {
		System.out.println("Aluno está aprovado com média: " + media);
	}
	
	
	else if (media>=5) {
		System.out.println("Aluno está em recuperação com média: " + media);
	}
	
	else {
		System.out.println("Aluno está reprovado com média: " + media);
	}
	
	sc.close();
	
}
	
}
