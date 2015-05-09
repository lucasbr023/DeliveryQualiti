package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.Pedido;

public abstract interface RepositorioPedido {
	
	public abstract void inserir(Pedido pedido) throws Exception;
	public abstract void remover(int codigo)throws Exception;
	public abstract void atualizar(Pedido pedido) throws Exception;
	public abstract Pedido procurar(int codigo) throws Exception;
	public abstract Pedido[] buscarTodosPedidos() throws Exception;
	
	

}
