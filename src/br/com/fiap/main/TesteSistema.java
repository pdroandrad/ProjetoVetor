package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteSistema {

	// String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	};

	// int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	};

	// double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	};

	public static void main(String[] args) {
		// preparar quantidade maxima de posições
		Produto[] vetorProduto = new Produto[3]; // [0] [1] []

		// o indice controla a entrada de produto nas posições preparadas
		int indice = 0;

		// começa com o valor de 0 para iniciar o while
		int resultado = 0;

		// entradas
		// enquanto o resultado for igual a 0 continua a repetição
		while (resultado == 0) {
			vetorProduto[indice] = new Produto();
			vetorProduto[indice].setMarca(texto("Informe a marca: "));
			vetorProduto[indice].setModelo(texto("Informe o modelo: "));
			vetorProduto[indice].setQuantidade(inteiro("Informe a quantidade: "));
			vetorProduto[indice].setValor(real("Informe o valor: "));
			
			indice++; // avança para o próximo vetor
			
			resultado = JOptionPane.showConfirmDialog(null, "Adicionar mais produtos no carrinho?",
					"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		// saíds
		for (int contador = 0 ; contador < indice ; contador ++) {
			System.out.println(
					"\nMarca:" + vetorProduto[contador].getMarca() +
					"\nModelo: " + vetorProduto[contador].getModelo() +
					"\nQuantidade: " + vetorProduto[contador].getQuantidade() +
					"\nValor: " + vetorProduto[contador].getValor()
					);
			
		}

	}

}
