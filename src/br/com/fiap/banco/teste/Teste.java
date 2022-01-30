package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;

public class Teste {
	
	public static void main(String[] args) {
		Conta cc = new Conta(); //instanciando classe Conta 
		
		/* acessa o atributo SALDO do obj Conta
		double valor = cc.saldo;
		System.out.println(valor); */
		
		cc.depositar(50);
		cc.setAgencia(123);
		//cc.setNumero(321);
		
		cc.depositar(100);
		
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta();
		poupanca.retirar(50);
		
		System.out.println(poupanca.getSaldo());
	}
}
