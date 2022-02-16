package model;

public class Carro {
	
	public Carro(String placa, String marca) {
		this.placa = placa;
		this.marca = marca;
		numeroCarros++;
	}
	
	public String placa;
	public String marca;

	public static int numeroCarros = 0;
	
}
