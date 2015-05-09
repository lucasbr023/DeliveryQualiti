package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;

public abstract interface RepositorioClientes{
	
	public abstract void inserir(Cliente cliente) throws Exception;
	public abstract void remover(String cpf) throws Exception;
	public abstract void atualizar(Cliente cliente) throws Exception;
	public abstract Cliente procurar(String cpf) throws Exception;
	public abstract Cliente[] buscarTodosClientes() throws Exception;

}
