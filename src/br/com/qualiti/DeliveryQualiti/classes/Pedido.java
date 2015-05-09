package br.com.qualiti.DeliveryQualiti.classes;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.util.StatusPedido;


public class Pedido {
	
	private int codigo;
	private Date dataPedido;
	private Cliente cliente;
	private Entregador entregador;
	private FormaPagamento formaPagamento;
	private ItemVenda[] itens;
	private StatusPedido statusPedido;
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Date getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Entregador getEntregador() {
		return entregador;
	}


	public void setEntregador(Entregador entregador) {
		this.entregador = entregador;
	}


	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public ItemVenda[] getItens() {
		return itens;
	}


	public void setItens(ItemVenda[] itens) {
		this.itens = itens;
	}


	public StatusPedido getStatusPedido() {
		return statusPedido;
	}


	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}


	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
		

}
