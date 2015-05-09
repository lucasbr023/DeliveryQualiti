package br.com.qualiti.DeliveryQualiti.repositorio;
import br.com.qualiti.DeliveryQualiti.classes.Pedido;


public class RepositorioPedidosArray {

	private int indice;
	private static final int TAMANHO_CACHE = 100;
	private Pedido[] pedidos;
	
	public RepositorioPedidosArray() {
		pedidos = new Pedido[TAMANHO_CACHE];
		indice = 0;
	
	}
	
	private int procurarIndice(int codigo){
		int posicao = -1;
		for(int i = 0; i < indice; i++){
			posicao = i;
			break;
			
		}
		return posicao;
		
	}
	
	
		
	public boolean existe(int codigo){
		return procurarIndice(codigo) != -1;
		
	}
	
	public void inserir(Pedido pedido){
		pedidos[indice++] = pedido;
		
	}
	
	public Pedido procurar(int codigo){
		Pedido retorno = null;
		int indice = 0;
		if(existe(codigo)){
			indice = procurarIndice(codigo);
			retorno = pedidos[indice];
			
		}
		return retorno;
		
	}
	
	
	
	public void atualizar(Pedido pedido){
		if(existe(pedido.getCodigo())){
			int i = procurarIndice(pedido.getCodigo());
			pedidos[i] = pedido;
		}
		
	}
	
	public void remover(int codigo){
		int i = 0;
		if (existe(codigo)){
			i = procurarIndice(codigo);
			pedidos[i] = pedidos[indice - 1];
			pedidos[indice - 1] = null;
			indice--;
			
		}
		
	}
	
	public Pedido[] buscarTodosPedido(){
		
		return pedidos;
	}
}
