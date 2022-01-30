package br.com.fiap.lacorepeticaoarray;

import java.util.Scanner;

public class ArrayMediaNotas {

	public static void main(String[] args) {
		
	    //armazenar as notas de uma turma de 10 alunos
		Scanner sc = new Scanner(System.in);
				
		float notas[] = new float[10];
		for (int i = 0; i < notas.length; i++) {
					
			System.out.println("Digite a nota do aluno: ");
			notas[i] = sc.nextFloat(); //var i é o indice, controla a posição do vetor
			
		}
		
		sc.close();
				
		//calcular a média global dos alunos 
		float totalNotas = 0;
		
		for(int i =0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A média dos alunos é: " + mediaNotas);
	}

}
