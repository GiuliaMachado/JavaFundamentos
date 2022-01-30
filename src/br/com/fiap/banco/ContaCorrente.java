package br.com.fiap.banco;

import java.util.Scanner;

/** 
 * 
 * @author giulia
 * 
 */

public class ContaCorrente extends Conta {
	
	public static void main(String[] args) {
		//leitura do que foi digitado
		Scanner sc = new Scanner(System.in);
		//op��o sim ou n�o
		String opcao;
		//cria��o do objeto saldo
		ContaCorrente saldo = new ContaCorrente();
		//mostra o saldo
		saldo.mostraSaldo();
		
		//Sacar dinheiro
		System.out.println("Deseja sacar dinheiro? s/n");
		//leitura da op��o digitada
		opcao = sc.next();
		if(opcao.equals("s")){
			double valor = 0;
			System.out.println("Qual o valor a ser retirado?");
			//leitura do valor digitado
			valor = sc.nextDouble();
			//retira o valor
			saldo.retirar(valor);
			System.out.printf("O saldo atual �: ");
			//mostra o saldo
			saldo.mostraSaldo();
			//mostra o valor retirado
			System.out.println("O valor retirado foi: " + valor);
		}
		sc.close();
	}
	//m�todo sacar dinheiro
	@Override
	public void retirar(double valor) {
		valor = valor +10; //taxa da conta corrente
		super.retirar(valor);
	}
	
}
