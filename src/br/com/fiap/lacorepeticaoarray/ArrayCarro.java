package br.com.fiap.lacorepeticaoarray;

public class ArrayCarro {
	
    private String modelo;
      
	public static void main(String[] args) {
		
		//array p armazenar as referencias de 5 carros
		ArrayCarro[] carros = new ArrayCarro[5]; //carros - vetor
		//instancia de objeto
		ArrayCarro carro = new ArrayCarro(); //carro - objeto
		carro.setModelo("Gol");
		//define o vetor na posição 0 recebendo o obj carro
		carros[0] = carro;  
		//saída de dados
		String modelo = carros[0].getModelo();
		System.out.println(modelo);
		
		
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}

}
