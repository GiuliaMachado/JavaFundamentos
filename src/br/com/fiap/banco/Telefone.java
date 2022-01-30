package br.com.fiap.banco;

import java.util.Scanner;

public class Telefone {
	/* Formatar o numero de telefone*/
	//variaveis
	private String ddd;
	private String telefone;
	
	public static void main(String[] args) {
		System.out.println("Insira o ddd do telefone:");
		//leitura do que foi digitado
		Scanner sc = new Scanner(System.in);
		String numero, ddd;
		ddd = sc.next();
		
		System.out.println("Insira o numero do telefone: ");
		numero = sc.next();
		
		Telefone tel = new Telefone();
		tel.formatarTelefone(ddd, numero);
		tel.mostraTelefone();
		
		sc.close();
	}
	public void mostraTelefone() {
		System.out.println("O telefone é: "+ getTelefoneFormatado());
	}
	
	public String getTelefoneFormatado() {
		return formatarTelefone(ddd, telefone);
	}

	public String formatarTelefone(String ddd, String telefone) {
		this.ddd = ddd;
		this.telefone = telefone;
		return "(" + ddd + ") " + telefone;
	}
}
