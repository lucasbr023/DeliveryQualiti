package br.com.qualiti.DeliveryQualiti.classes;

public class ItemVenda {
	
	
	private Integer sequencial;
	private Produto produto;
	private double quantidade;
	
	public ItemVenda() {
		// TODO Auto-generated constructor stub
	}

	public Integer getSequencial() {
		return sequencial;
	}

	public void setSequencial(Integer sequencial) {
		this.sequencial = sequencial;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
