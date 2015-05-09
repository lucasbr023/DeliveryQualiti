package br.com.qualiti.DeliveryQualiti.classes;
import java.util.Date;


public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private Date dataNascimento;
	
	
	
	

	

	

	public Pessoa() {
		// TODO Auto-genera	ted constructor stub
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


}
