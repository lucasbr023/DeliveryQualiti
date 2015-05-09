package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.FormaPagamento;


public abstract interface RepositorioFormaPagamento {
	
	public abstract void inserir(FormaPagamento formaPagamento) throws Exception;
	public abstract void remover(int codigo)throws Exception;
	public abstract void atualizar(FormaPagamento formaPagamento) throws Exception;
	public abstract FormaPagamento procurar(int codigo) throws Exception;
	public abstract FormaPagamento[] buscarTodasFormasPagamento() throws Exception;

}
