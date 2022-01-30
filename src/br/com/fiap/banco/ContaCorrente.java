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
		//opção sim ou não
		String opcao;
		//criação do objeto saldo
		ContaCorrente saldo = new ContaCorrente();
		//mostra o saldo
		saldo.mostraSaldo();
		
		//Sacar dinheiro
		System.out.println("Deseja sacar dinheiro? s/n");
		//leitura da opção digitada
		opcao = sc.next();
		if(opcao.equals("s")){
			double valor = 0;
			System.out.println("Qual o valor a ser retirado?");
			//leitura do valor digitado
			valor = sc.nextDouble();
			//retira o valor
			saldo.retirar(valor);
			System.out.printf("O saldo atual é: ");
			//mostra o saldo
			saldo.mostraSaldo();
			//mostra o valor retirado
			System.out.println("O valor retirado foi: " + valor);
		}
		sc.close();
	}
	//método sacar dinheiro
	@Override
	public void retirar(double valor) {
		valor = valor +10; //taxa da conta corrente
		super.retirar(valor);
	}
	
}
