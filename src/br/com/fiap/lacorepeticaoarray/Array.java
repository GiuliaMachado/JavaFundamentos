package br.com.fiap.lacorepeticaoarray;

public class Array {
	private String nomeComida;
	public static void main(String[] args) {
		
		//Array de 30 caracteres
		Array comida[] = new Array[30];
		
		//instancia
		Array comidas = new Array();
		//muda o nome do objeto 
		comidas.setComida("Pato Assado");
		//define a posição 0 do vetor para receber o objeto
		comida[0] = comidas;
		
		String nomeComida = comida[0].getComida();
		System.out.println(nomeComida);
		
		/* array usado como objeto e com 40 numeros inteiros
		int notas[] = new int[40]; 
		System.out.println(notas);
		
		int notas1[] = {10,9,8,2}; //posições preenchidas
		int notas2[] = new int[]{10,9,8,2}; //outra forma igual
		System.out.println(notas1);
		System.out.println(notas2);
		
		//pode criar array com qualquer tipo de dado
		byte bytes[] = new byte[0];
		double doubles[] = new double[12];
		boolean sim[] = new boolean[1];
		System.out.println(bytes);
		System.out.println(doubles);
		System.out.println(sim);
		 */
	}
	public void setComida(String nomeComida) {
		this.nomeComida = nomeComida;
	}
	public String getComida() {
		return nomeComida;
	}

}
