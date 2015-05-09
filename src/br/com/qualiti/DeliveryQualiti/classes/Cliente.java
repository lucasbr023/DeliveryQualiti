package br.com.qualiti.DeliveryQualiti.classes;

/**
 * @author lucas
 *
 */
public class Cliente extends Pessoa{


	private Endereco endereco;
	private String celular;
	private String telefone;
	private ItemVenda item;
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

	public ItemVenda getItem() {
		return item;
	}

	public void setItem(ItemVenda item) {
		this.item = item;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	



}
