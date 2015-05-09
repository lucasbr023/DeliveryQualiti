package br.com.qualiti.DeliveryQualiti.negocios;

import br.com.qualiti.DeliveryQualiti.Exception.CampoNumericoPreenchidoComLetrasException;
import br.com.qualiti.DeliveryQualiti.Exception.CampoObrigatorioNãoInformadoException;
import br.com.qualiti.DeliveryQualiti.Exception.CampoPreenchidoIncorretamenteException;
import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.interfaces.ICadastroClientes;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioClientesArray;
import br.com.qualiti.DeliveryQualiti.util.Util;

public class CadastroClientes implements ICadastroClientes {


	private RepositorioClientesArray repositorio;

	public CadastroClientes(RepositorioClientesArray repositorio){
		this.repositorio = repositorio;
	}

	public void inserir(Cliente cliente) throws Exception{
		if(validar(cliente)){
			repositorio.inserir(cliente);
		}
	}

	public void remover(String cpf) throws Exception{
		repositorio.remover(cpf);
	}

	public void atualizar(Cliente cliente) throws Exception{
		if(validar(cliente)){
			repositorio.atualizar(cliente);
		}
	}

	public Cliente procurar(String cpf) throws Exception{
		return repositorio.procurar(cpf);
	}

	public Cliente[] buscarTodosClientes() throws Exception{
		return repositorio.buscarTodosClientes();
	}

	public static  final boolean validar(Cliente cliente)  throws Exception{

		if (cliente.getNome() == null || cliente.getNome().isEmpty()){
			throw new CampoObrigatorioNãoInformadoException("Nome não informado!");
		}
		if (cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("CPF não informado");
		}
		if (cliente.getCpf().length() != 11) {
			throw new CampoPreenchidoIncorretamenteException("O CPF deve conter apenas 11 digitos!");
		}
		/*if (cliente.getCpf().matches("\\d+")) {
			throw new CampoNumericoPreenchidoComLetrasException("CPF deve conter apenas numeros!") ;
		}*/
		if (cliente.getCelular() == null || cliente.getCelular().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Celular não informado!");
		}
		if (cliente.getCelular().matches("^[d]+")) {
			throw new CampoNumericoPreenchidoComLetrasException("Celular deve conter apenas numeros!");
		}
		if (cliente.getCelular().length() < 8 || cliente.getCelular().length() > 12) {
			throw new CampoPreenchidoIncorretamenteException("Celular deve conter de 8 a 12 digitos");
		}
		if (cliente.getTelefone() == null || cliente.getTelefone().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Telefone não informado");
		}
		if (cliente.getTelefone().matches("^[d]+")) {
			throw new CampoNumericoPreenchidoComLetrasException("Telefone deve conter apenas numeros!");
		}
		if (cliente.getTelefone().length() < 8 || cliente.getTelefone().length() > 12) {
			throw new CampoPreenchidoIncorretamenteException("Telefone deve conter de 8 a 12 digitos");
		}
		if (cliente.getDataNascimento() == null) {
			throw new CampoObrigatorioNãoInformadoException("Data de Nascimento não informada");
		}
		if (cliente.getEmail() == null || cliente.getEmail().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Email não informado");
		}
		if (!cliente.getEmail().contains("@") || !cliente.getEmail().contains(".")) {
			throw new CampoPreenchidoIncorretamenteException("Email deve conter os caracteres @ e .");
		}
		if (cliente.getEmail().matches("[A-Z]+")) {
			throw new CampoPreenchidoIncorretamenteException("Email deve conter apenas letras minusculas");
		}
		/*if (cliente.getEndereco() == null) {
			throw new CampoObrigatorioNãoInformadoException("Endereço não informado");
		}
		if(cliente.getEndereco().getLogradouro() == null || cliente.getEndereco().getLogradouro().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Logradouro não informado");
		}*/
		return true;
	}


}
