package br.com.qualiti.DeliveryQualiti.util;

public enum StatusPedido {
	
	SOLICITADO("Solicitado"),
	AGUARDANDO_PAGAMENTO("Aguardando Pagamento"),
	EM_ELABORACAO("Em Elaboração"),
	AGUARDANDO_ENTREGA("Aguardando Entrega"),
	ENCAMINHADO("Encaminhado"),
	ENTREGUE("Entregue"),
	DEVOLVIDO("Devolvido"),
	CANCELADO("Cancelado");
	
	private String nome;
	
	private StatusPedido(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}