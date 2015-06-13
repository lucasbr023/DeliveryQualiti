package br.com.qualiti.DeliveryQualiti.classes;

import java.io.Serializable;

/**
 * @author lucas
 *
 */
public class Cliente extends Pessoa {


	


	private Endereco endereco;
	private String celular;
	private String telefone;
	private String Email;

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Cliente() {

	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}



	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	@Override
	public Serializable getId() {
		return getCpf();
	}
	
	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", celular=" + celular
				+ ", telefone=" + telefone + ", Email=" + Email + "]";
	}






}
