package br.com.fiap.si;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int x = 9;
		int y = 2;
		
		int soma = x + y;
		int diferenca = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
		
		System.out.println("Resultado da soma= " + soma);
		System.out.println("Resultado da diferen�a= " + diferenca);
		System.out.println("Resultado da multiplica��o= " + multiplicacao);
		System.out.println("Resultado da divis�o= " + divisao);
		System.out.println("Resultado do resto= " + resto);
		
		x++;
		System.out.println("Incremento da vari�vel x= " + x);
		
		x=9;
		x--;
		System.out.println("Decremento da vari�vel x= " + x);
		
		x=9;
		x += 10;
		System.out.println("Atribui��o + 10 ao valor de x= " + x);
		
		x=9;
		x -= 10;
		System.out.println("Atribui��o -10 ao valor de x= "+ x); 
	}

}
