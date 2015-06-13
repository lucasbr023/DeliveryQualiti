package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;

import br.com.qualiti.DeliveryQualiti.classes.Entregador;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioEntregadoresJDBC implements Repositorio<Entregador>{

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(Entregador entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Entregador entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entregador procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entregador[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
