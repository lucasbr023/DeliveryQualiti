package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;

import br.com.qualiti.DeliveryQualiti.classes.FormaPagamento;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioFormasPagamentoJDBC implements Repositorio<FormaPagamento>{

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void inserir(FormaPagamento entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(FormaPagamento entidade) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FormaPagamento procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FormaPagamento[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
