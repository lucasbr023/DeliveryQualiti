package br.com.qualiti.DeliveryQualiti.classes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import br.com.qualiti.DeliveryQualiti.util.StatusPedido;


public class Pedido implements EntidadeBasica {
	
	private Integer codigo;
	private Date dataPedido;
	private Cliente cliente;
	private Entregador entregador;
	private FormaPagamento formaPagamento;
	private ItemVenda[] itens;
	private StatusPedido statusPedido;
	
	
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
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


	@Override
	public Serializable getId() {
		// TODO Auto-generated method stub
		return getCodigo();
	}


	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", dataPedido=" + dataPedido
				+ ", cliente=" + cliente + ", entregador=" + entregador
				+ ", formaPagamento=" + formaPagamento + ", itens="
				+ Arrays.toString(itens) + ", statusPedido=" + statusPedido
				+ "]";
	}
	
	
	
	
		

}
