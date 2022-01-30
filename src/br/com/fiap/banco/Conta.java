package br.com.fiap.banco;

import java.util.Scanner;

/**
 * 
 * @author giulia
 * @version 1.0
 * Conta bancária 
 */
public class Conta {
	
	private String numero;
	private int agencia;
	private double saldo = 1000;
	
	public static void main(String[] args) {
		
		double valor;
		
		//input do número da agencia
		System.out.println("Digite o Número da agência: ");
		//leitura do teclado
		Scanner sc = new Scanner(System.in);
		//instancia de objeto
		Conta contaAgencia = new Conta();
		//leitura do dado inserido
		int agencia = sc.nextInt();
		//muda o nome da agencia com o que foi inserido
		contaAgencia.setAgencia(agencia);
		//exibe o nome da agencia
		contaAgencia.mostraAgencia();
		
		//numero de telefone
		System.out.println("Digite o número de telefone: ");
		Conta contaTel = new Conta();
		String numero = sc.next();
		contaTel.setNumero(numero);
		contaTel.mostraTelefone();	
		
		//mostrar o saldo
		Conta saldo = new Conta();
		saldo.mostraSaldo();
		//Opção Sacar/Depositar
		System.out.println("Para depositar digite '1', para sacar digite '2'. Para sair aperte qualquer outra tecla.");
		//variavel opcao 1 ou 2.
		String opcao;
		//armazena a opção digitada
		opcao = sc.next();
		if(opcao.equals("1")) {
			
			System.out.println("Digite o valor a depositar:");
			//armazena o valor digitado
			valor = sc.nextDouble();
			//deposita o valor
			saldo.depositar(valor);
			//mostra o saldo
			saldo.mostraSaldo();
			
		}else if(opcao.equals("2")) {
			
			System.out.println("Digite o valor para sacar: ");
			//armazena o valor digitado
			valor = sc.nextDouble();
			//retira o valor
			saldo.retirar(valor);
			//mostra o saldo
			saldo.mostraSaldo();
			
		}
			
		sc.close();
	}
	//construtor
	public Conta() { 
		
	}
	//metodo para mostrar o saldo
	public void mostraSaldo() {
		System.out.println("O saldo é: " + getSaldo());
	}
	//método para exibir a Agencia
	public void mostraAgencia() {
		System.out.println("A agencia é: " + getAgencia());	
	}
	//metodo para exibir o telefone
	public void mostraTelefone() {
		System.out.println("O telefone é: "+ getNumero());
	}
	/**
	 * 
	 * @param numero
	 * @param agencia
	 * @param saldo
	 */
	
	//construtor
	public Conta(String numero, int agencia, double saldo) { 
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	//método depositar
	public void depositar(double valor) { 
		this.saldo += valor;
	}
	//método retirar dinheiro
	public void retirar(double valor) { 
		this.saldo -= valor;
	}
	/**
	 * 
	 * @return Valor do saldo da conta
	 */
	
	//Encapsulamento Get/Set 
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}

}
