package br.com.qualiti.DeliveryQualiti.classes;

import java.io.Serializable;

public class FormaPagamento implements EntidadeBasica {
	
	private Integer codigo;
	private String nome;
	
	public FormaPagamento() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return getCodigo();
	}

	@Override
	public String toString() {
		return "FormaPagamento [codigo=" + codigo + ", nome=" + nome + "]";
	}

	
	
}
