package br.com.qualiti.DeliveryQualiti.negocios;

import br.com.qualiti.DeliveryQualiti.Exception.CampoObrigatorioNãoInformadoException;
import br.com.qualiti.DeliveryQualiti.Exception.CampoPreenchidoIncorretamenteException;
import br.com.qualiti.DeliveryQualiti.classes.FormaPagamento;
import br.com.qualiti.DeliveryQualiti.interfaces.ICadastroFormaPagamento;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioFormasPagamentoArray;

public class CadastroFormasPagamento implements ICadastroFormaPagamento {

	private RepositorioFormasPagamentoArray repositorio;


	public CadastroFormasPagamento(RepositorioFormasPagamentoArray repositorio) {
		this.repositorio = repositorio;
	}

	public void inserir(FormaPagamento formaPagamento) throws Exception{
		if(validar(formaPagamento)){
			repositorio.inserir(formaPagamento);
		}
	}

	public void remover(int codigo) throws Exception{
		repositorio.remover(codigo);
	}

	public void atualizar(FormaPagamento formaPagamento) throws Exception{
		if(validar(formaPagamento)){
			repositorio.atualizar(formaPagamento);
		}
	}

	public FormaPagamento procurar(int codigo) throws Exception{
		return repositorio.procurar(codigo);

	}

	public FormaPagamento[] buscarTodasFormasPagamento() throws Exception{
		return repositorio.buscarFormasPagamento();

	}

	public static boolean validar(FormaPagamento formaPagamento) throws Exception{
		if (formaPagamento.getNome() == null || formaPagamento.getNome().isEmpty()) {
			throw new CampoObrigatorioNãoInformadoException("Forma de Pagamento não informada");
		}
		
		if (!formaPagamento.getNome().matches("[w]+")) {
			throw new CampoPreenchidoIncorretamenteException(" ");
		}

		return true;
	}

}
