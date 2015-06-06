package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;

import br.com.qualiti.DeliveryQualiti.classes.Pedido;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioPedidosColecaoMap implements Repositorio<Pedido>{

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Pedido entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Pedido entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedido procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
