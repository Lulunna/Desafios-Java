package atividade;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano:");
        int ano = sc.nextInt();

        if (ehAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        sc.close();
    }

    
    public static boolean ehAnoBissexto(int ano) {
       
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}	
