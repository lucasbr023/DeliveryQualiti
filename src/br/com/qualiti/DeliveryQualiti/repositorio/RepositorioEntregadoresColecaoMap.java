package br.com.qualiti.DeliveryQualiti.repositorio;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import br.com.qualiti.DeliveryQualiti.classes.Entregador;
import br.com.qualiti.DeliveryQualiti.interfaces.Repositorio;

public class RepositorioEntregadoresColecaoMap implements Repositorio<Entregador>{
	
	private Map repositorio;
	
	public RepositorioEntregadoresColecaoMap() {
		this.repositorio = new HashMap();
	}
	
	@Override
	public boolean existe(Serializable matricula) throws Exception {
		return this.repositorio.containsKey(matricula);
	}

	@Override
	public void inserir(Entregador entregador) throws Exception {
		//this.repositorio.put(entregador.getMatricula(), entregador);
	}

	@Override
	public void atualizar(Entregador entregador) throws Exception {
		this.repositorio.put(entregador.getMatricula(), entregador);
	}

	@Override
	public void remover(Serializable matricula) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entregador procurar(Serializable matricula) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entregador[] buscarTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	

}
