package br.com.qualiti.DeliveryQualiti.negocios;

import br.com.qualiti.DeliveryQualiti.Exception.CampoNumericoPreenchidoComLetrasException;
import br.com.qualiti.DeliveryQualiti.Exception.CampoObrigatorioNãoInformadoException;
import br.com.qualiti.DeliveryQualiti.Exception.CampoPreenchidoIncorretamenteException;
import br.com.qualiti.DeliveryQualiti.classes.Entregador;
import br.com.qualiti.DeliveryQualiti.interfaces.ICadastroEntregador;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioEntregadoresArray;

public class CadastroEntregadores implements ICadastroEntregador {

	private RepositorioEntregadoresArray repositorio;

	public CadastroEntregadores(RepositorioEntregadoresArray repositorio) {
		this.repositorio = repositorio;
	}

	public void inserir(Entregador entregador) throws Exception{
		if(validar(entregador)){
			repositorio.inserir(entregador);
		}
	}
	public void remover(String matricula) throws Exception{
		repositorio.remover(matricula);

	}
	
	@Override
	public void atualizar(Entregador entregador) throws Exception{
		if(validar(entregador)){
			repositorio.atualizar(entregador);
		}
		
	}

	

	public Entregador procurar(String matricula) throws Exception{
		return repositorio.procurar(matricula);
	}

	public Entregador[] buscarTodosEntregadores() throws Exception{
		return repositorio.buscarTodosEntregadores();

	}

	public static boolean validar(Entregador entregador) throws Exception{
		if (entregador.getNome() == null || entregador.getNome().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Nome do entregador não informado");
		}
		
		if (!entregador.getNome().matches("[w]+")) {
			throw new CampoPreenchidoIncorretamenteException("");
		}
		
		
		if (entregador.getMatricula().matches("^[d]+")) {
			throw new CampoPreenchidoIncorretamenteException("Matricula deve conter apenas numeros");
		}
		
		if (entregador.getModeloMoto() == null || entregador.getModeloMoto().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Modelo moto nao informada");
		}
		
		if (entregador.getPlacaMoto() == null || entregador.getPlacaMoto().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Placa nao informada");
		}
		
		if (entregador.getTelefone() == null || entregador.getTelefone().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Telefone nao informado");
		}
 		
		if (entregador.getTelefone().matches("^[d]+")) {
			throw new CampoNumericoPreenchidoComLetrasException("Telefone deve conter apenas numeros");
		}
		
		return true;
	}

	


}
