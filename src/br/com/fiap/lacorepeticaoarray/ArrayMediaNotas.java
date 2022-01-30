package br.com.fiap.lacorepeticaoarray;

import java.util.Scanner;

public class ArrayMediaNotas {

	public static void main(String[] args) {
		
	    //armazenar as notas de uma turma de 10 alunos
		Scanner sc = new Scanner(System.in);
				
		float notas[] = new float[10];
		for (int i = 0; i < notas.length; i++) {
					
			System.out.println("Digite a nota do aluno: ");
			notas[i] = sc.nextFloat(); //var i � o indice, controla a posi��o do vetor
			
		}
		
		sc.close();
				
		//calcular a m�dia global dos alunos 
		float totalNotas = 0;
		
		for(int i =0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A m�dia dos alunos �: " + mediaNotas);
	}

}
