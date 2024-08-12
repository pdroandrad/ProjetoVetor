package br.com.fiap.beans;

public class Produto {

	// visibilidade, tipo de dados e atributos
	private String marca;
	private String modelo;
	private int quantidade;
	private double valor;
	
	// construtor vazio
	public Produto() {
		super();
	}

	// construtor cheio
	public Produto(String marca, String modelo, int quantidade, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	// setters (entrada) e getters (exibir/retornar)
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "\nMarca: " + marca + "\nModelo: " + modelo + "\nQuantidade: " + quantidade + "\nValor: " + valor;
	}
	
	
	
	
}
