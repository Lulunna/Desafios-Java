package atividade;

import java.util.Scanner;

public class Atividade08 {
public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a nota do aluno: ");
	int nota = sc.nextInt();
	
	char media;
    if (nota >= 9) {
        media = 'A';
    } else if (nota >= 7) {
        media = 'B';
    } else if (nota >= 5) {
        media = 'C';
    } else if (nota >= 3) {
        media = 'D';
    } else {
        media = 'F';
    }
	
    System.out.println("A nota do aluno é: " + media);
	
    sc.close();
}
	
}
