package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;

import br.com.qualiti.DeliveryQualiti.classes.Produto;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioProdutosColecaoMap implements Repositorio<Produto>{

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produto procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
