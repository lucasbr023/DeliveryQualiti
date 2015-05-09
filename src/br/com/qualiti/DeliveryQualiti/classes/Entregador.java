package br.com.qualiti.DeliveryQualiti.classes;

public class Entregador  extends Pessoa{
	
	private String nome;
	private String matricula;
	private String placaMoto;
	private String modeloMoto;
	public String getPlacaMoto() {
		return placaMoto;
	}

	public void setPlacaMoto(String placaMoto) {
		this.placaMoto = placaMoto;
	}

	public String getModeloMoto() {
		return modeloMoto;
	}

	public void setModeloMoto(String modeloMoto) {
		this.modeloMoto = modeloMoto;
	}

	private String telefone;
	private int quantidadeEntregas;
	
	public Entregador() {
	
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getQuantidadeEntregas() {
		return quantidadeEntregas;
	}

	public void setQuantidadeEntregas(int quantidadeEntregas) {
		this.quantidadeEntregas = quantidadeEntregas;
	}


}
