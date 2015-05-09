package br.com.qualiti.DeliveryQualiti.negocios;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.Exception.CampoObrigatorioNãoInformadoException;
import br.com.qualiti.DeliveryQualiti.classes.Pedido;
import br.com.qualiti.DeliveryQualiti.interfaces.ICadastroPedido;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioPedidosArray;

public class CadastroPedidos implements ICadastroPedido{

	private RepositorioPedidosArray repositorio;

	public CadastroPedidos(RepositorioPedidosArray repositorio) {
		this.repositorio = repositorio;

	}

	public void inserir(Pedido pedido) throws Exception{
		if(validar(pedido)){
			repositorio.inserir(pedido);
		}

	}

	public void atualizar(Pedido pedido) throws Exception{
		if(validar(pedido)){
			repositorio.atualizar(pedido);
		}

	}
	public void remover(int codigo) throws Exception{

		repositorio.remover(codigo);
	}

	public Pedido procurar(int codigo) throws Exception{
		return repositorio.procurar(codigo);
	}

	public Pedido[] buscarTodosPedidos() throws Exception{
		return repositorio.buscarTodosPedido();

	}

	public static boolean validar(Pedido pedido) throws Exception{

		if (pedido.getCliente() == null) {
			throw new CampoObrigatorioNãoInformadoException("Pedido não informado!");
		}
		
		if (!CadastroClientes.validar(pedido.getCliente())) {
			return false;
		}
			
		if (pedido.getEntregador() == null) {
			return false;
		}
		
		if (!CadastroEntregadores.validar(pedido.getEntregador())) {
			return false;
		}
		
		if (pedido.getDataPedido() == null) {
			return false;
		}
		
		if (pedido.getDataPedido().before(new Date())) {
			return false;
		}
		
		if (pedido.getFormaPagamento() == null) {
			return false;
		}
		
		if (!CadastroFormasPagamento.validar(pedido.getFormaPagamento())) {
			return false;
		}

		if (pedido.getItens() == null || pedido.getItens().length == 0) {
			return false;
		}
		return true;

	}


}
