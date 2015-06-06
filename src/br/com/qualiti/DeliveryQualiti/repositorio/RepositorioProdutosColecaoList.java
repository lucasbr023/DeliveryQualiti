package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.qualiti.DeliveryQualiti.classes.Produto;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioProdutosColecaoList implements Repositorio<Produto>{
	
	List<Produto> repositorio;
	public RepositorioProdutosColecaoList() {
		this.repositorio = new ArrayList<>();
	}

	@Override
	public boolean existe(Serializable codigo) throws Exception {
		return procurar(codigo) != null;
	}

	@Override
	public void inserir(Produto produto) throws Exception {
		this.repositorio.add(produto);
	}

	@Override
	public void atualizar(Produto produto) throws Exception {
		Produto aux = procurar(produto.getCodigo());
		int index = this.repositorio.indexOf(aux);
		this.repositorio.set(index, produto);
	}

	@Override
	public void remover(Serializable codigo) throws Exception {

		Produto aux = procurar(codigo);
		this.repositorio.remove(aux);
	}

	@Override
	public Produto procurar(Serializable codigo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto[] buscarTodos() throws Exception {
		Produto[] result = new Produto[this.repositorio.size()];
		result = this.repositorio.toArray(result);
		return result;
		
	}
	

}
