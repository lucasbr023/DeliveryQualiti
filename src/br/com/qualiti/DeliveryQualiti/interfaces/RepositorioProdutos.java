package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.Produto;

public interface RepositorioProdutos {
	
	public abstract void inserir(Produto produto) throws Exception;
	public abstract void remover(int codigo)throws Exception;
	public abstract void atualizar(Produto produto) throws Exception;
	public abstract Produto procurar(int codigo) throws Exception;
	public abstract Produto[] buscarTodosProdutos() throws Exception;

}
