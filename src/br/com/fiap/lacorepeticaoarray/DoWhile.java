package br.com.fiap.lacorepeticaoarray;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcao;
		
		do {
			System.out.println("Digite um n�mero:");
			int n1 = sc.nextInt();
			System.out.println("Digite outro n�mero:");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("O resultado �: " + soma);
			System.out.println("Deseja somar outro n�mero? (s/n)");
		    opcao = sc.next();
		} while(opcao.equals("s"));
		sc.close();
	}

}
