package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioClientesColecaoSet implements Repositorio<Cliente>{

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Cliente entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Cliente entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
