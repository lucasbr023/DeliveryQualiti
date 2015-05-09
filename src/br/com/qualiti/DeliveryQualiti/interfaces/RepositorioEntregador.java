package br.com.qualiti.DeliveryQualiti.interfaces;

import br.com.qualiti.DeliveryQualiti.classes.Entregador;


public abstract interface RepositorioEntregador{
	
	public abstract void inserir(Entregador entregador) throws Exception;
	public abstract void remover(String cpf)throws Exception;
	public abstract void atualizar(Entregador entregador) throws Exception;
	public abstract Entregador procurar(String cpf) throws Exception;
	public abstract Entregador[] buscarTodosEntregadores() throws Exception;

}
