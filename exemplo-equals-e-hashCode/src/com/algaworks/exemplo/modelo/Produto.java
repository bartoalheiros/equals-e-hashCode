package com.algaworks.exemplo.modelo;

import java.util.Objects;

public class Produto {

	private String sku; // IHPD2360, IEPL1010, CHPO21, CHPR21
	private String nome; // Impressora HP Deskjet 2360

	public Produto(String sku, String nome) {
		this.sku = sku;
		this.nome = nome;
}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Produto [sku=" + sku + ", nome=" + nome + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Produto produto = (Produto) o;
		return sku.equals(produto.sku);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sku);
	}
}
