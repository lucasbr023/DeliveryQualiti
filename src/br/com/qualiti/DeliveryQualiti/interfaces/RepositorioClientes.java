package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;

public abstract interface RepositorioClientes{
	
	boolean existe(String cpf)throws Exception;
	void inserir(Cliente cliente) throws Exception;
	void atualizar(Cliente cliente) throws Exception;
	void remover(String cpf) throws Exception;
	Cliente procurar(String cpf) throws Exception;
	Cliente[] buscarTodosClientes()throws Exception;

}
