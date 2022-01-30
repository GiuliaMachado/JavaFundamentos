package br.com.fiap.si;

import java.util.Scanner;

public class EntradaSaidaDados {

	public static void main(String[] args) {
		
		
		System.out.println("Digite a idade: ");
		Scanner sc = new Scanner(System.in); //le dados do sistema ou digitados pelo user
		int idade = sc.nextInt(); //le um numero inteiro
		if((idade > 0) && (idade < 130)) {
			System.out.println("Idade digitada:"+idade);
		}
		else {
			System.out.println("Valor inválido");
		}
		sc.close();
		} 
	}
