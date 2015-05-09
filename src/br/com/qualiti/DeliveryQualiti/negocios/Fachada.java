package br.com.qualiti.DeliveryQualiti.negocios;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.classes.Entregador;
import br.com.qualiti.DeliveryQualiti.classes.FormaPagamento;
import br.com.qualiti.DeliveryQualiti.classes.Pedido;
import br.com.qualiti.DeliveryQualiti.classes.Produto;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioClientesArray;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioEntregadoresArray;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioFormasPagamentoArray;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioPedidosArray;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioProdutosArray;



public class Fachada {

	public static Fachada instancia;
	private CadastroClientes cadastroClientes;
	private CadastroEntregadores cadastroEntregadores;
	private CadastroFormasPagamento cadastroFormasPagamento;
	private CadastroPedidos cadastroPedidos;
	private CadastroProdutos cadastroProdutos;


	private Fachada(){
		super();
		init();
	}

	public static Fachada getInstancia(){
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	private void init() {
		cadastroClientes = new CadastroClientes(new RepositorioClientesArray());
		cadastroEntregadores = new CadastroEntregadores(new RepositorioEntregadoresArray());
		cadastroFormasPagamento = new CadastroFormasPagamento(new RepositorioFormasPagamentoArray());
		cadastroPedidos = new CadastroPedidos(new RepositorioPedidosArray());
		cadastroProdutos = new CadastroProdutos(new RepositorioProdutosArray());
	}
	//--------------------------------------------------------------------------------------------
	//Cliente
	public void inserirCliente(Cliente cliente) throws Exception {
		cadastroClientes.inserir(cliente);
	}

	public void removerCliente(String cpf) throws Exception{
		cadastroClientes.remover(cpf);
	}


	public void atualizarCliente(Cliente cliente)throws Exception {
		cadastroClientes.atualizar(cliente);
	}


	public Cliente procurarCliente(String cpf) throws Exception{
		return cadastroClientes.procurar(cpf);
	}


	public Cliente[] buscarTodosClientes()throws Exception {
		return cadastroClientes.buscarTodosClientes();
	}
	//----------------------------------------------------------

	//Entregador

	public void inserirEntregador(Entregador entregador) throws Exception{
		cadastroEntregadores.inserir(entregador);

	}
	public void removerEntregador(String matricula) throws Exception{
		cadastroEntregadores.remover(matricula);

	}
	public void atualizarEntregador(Entregador entregador) throws Exception{
		cadastroEntregadores.atualizar(entregador);

	}

	public Entregador procurarEntregador(String matricula) throws Exception{
		return cadastroEntregadores.procurar(matricula);

	}

	public Entregador[] buscarTodosEntregadores() throws Exception{
		return cadastroEntregadores.buscarTodosEntregadores();

	}
	//-------------------------------------------------------------------

	//FormaPagamento

	public void inserirFormaPagamento(FormaPagamento formaPagamento) throws Exception{
		cadastroFormasPagamento.inserir(formaPagamento);

	}
	public void removerFormaPagamento(int codigo) throws Exception{
		cadastroFormasPagamento.remover(codigo);

	}

	public void atualizarFormaPagamento(FormaPagamento formaPagamento) throws Exception{
		cadastroFormasPagamento.atualizar(formaPagamento);

	}
	public FormaPagamento procurarFormaPagamento(int codigo) throws Exception{
		return cadastroFormasPagamento.procurar(codigo);

	}
	public FormaPagamento[] buscarTodasFormasPagamento() throws Exception{
		return cadastroFormasPagamento.buscarTodasFormasPagamento();
	}
	//--------------------------------------------------------------------------------
	//Pedido

	public void inserirPedido(Pedido pedido)throws Exception{
		cadastroPedidos.inserir(pedido);
	}

	public void removerPedido(int codigo)throws Exception{
		cadastroPedidos.remover(codigo);

	}

	public void atualizarPedido(Pedido pedido)throws Exception{
		cadastroPedidos.atualizar(pedido);

	}
	public Pedido procurarPedido(int codigo)throws Exception{
 		return cadastroPedidos.procurar(codigo);

	}

	public Pedido[] buscarTodosPedidos()throws Exception{
		return cadastroPedidos.buscarTodosPedidos();

	}
	//-------------------------------------------------------------------------
	//produtos

	public void inserirProduto(Produto produto)throws Exception{
		cadastroProdutos.inserir(produto);

	}
	public void removerProduto(int codigo)throws Exception{
		cadastroProdutos.remover(codigo);

	}
	public void atualizarProduto(Produto produto)throws Exception{
		cadastroProdutos.atualizar(produto);

	}
	public Produto procurarProduto(int codigo)throws Exception{
		return cadastroProdutos.procurar(codigo);

	}
	public Produto[] buscarTodosProdutos()throws Exception{

		return cadastroProdutos.buscarTodosProdutos();
	}

}
