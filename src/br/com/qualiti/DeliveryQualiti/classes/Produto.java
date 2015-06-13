package br.com.qualiti.DeliveryQualiti.classes;
import java.io.Serializable;
import java.util.Date;

public class Produto implements EntidadeBasica {
	
	private Integer codigo;
	private String nome;
	private double precoUnitario;
	private Date dataValidade;
	
	public Produto() {
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

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return getCodigo();
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome
				+ ", precoUnitario=" + precoUnitario + ", dataValidade="
				+ dataValidade + "]";
	}
	
	
	
	

}
