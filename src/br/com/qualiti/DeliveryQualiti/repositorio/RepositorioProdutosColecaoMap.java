package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import br.com.qualiti.DeliveryQualiti.classes.Produto;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioProdutosColecaoMap implements Repositorio<Produto>{
	
	private Map repositorio;
	
	public RepositorioProdutosColecaoMap() {
		repositorio = new HashMap();
	}

	@Override
	public boolean existe(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return repositorio.containsKey(chave);
	}

	@Override
	public void inserir(Produto entidade) throws Exception {
		repositorio.put(entidade.getCodigo(), entidade);
	}

	@Override
	public void atualizar(Produto entidade) throws Exception {
		// TODO Auto-generated method stub
		repositorio.put(entidade.getCodigo(), entidade);
	}

	@Override
	public void remover(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		repositorio.remove(chave);
	}

	@Override
	public Produto procurar(Serializable chave) throws Exception {
		// TODO Auto-generated method stub
		return (Produto) repositorio.get(chave) ;
	}

	@Override
	public Produto[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return (Produto[]) repositorio.values().toArray(new Produto[repositorio.size()]);
	}

}
