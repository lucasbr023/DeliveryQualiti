package br.com.qualiti.DeliveryQualiti.repositorio;
import br.com.qualiti.DeliveryQualiti.classes.Produto;


public class RepositorioProdutosArray {
	public static final int TAMANHO_CACHE = 1000000;
	private Produto[] produtos;
	private int indice;
	
	public RepositorioProdutosArray() {
		produtos = new Produto[TAMANHO_CACHE];
		indice = 0;
	}
	
	//CRUD
	private int procurarIndice(int codigo){
		int posicao = -1;
		for(int i = 0; i < indice; i++){
			if(produtos[i].getCodigo() == codigo){
				posicao = i;
			}
		}
		return posicao;
	}
	
	public boolean existe(int codigo){
		return procurarIndice(codigo) != -1;
		
	}
	
	public Produto procurar(int codigo){
		Produto retorno = null;
		int indice = 0;
		if(existe(codigo)){
			indice = procurarIndice(codigo);
			retorno = produtos[indice];
			
		}
		return retorno;

	}
	
	public void inserir(Produto produto){
		produtos[indice++] = produto;
		
	}
	
	public void atualizar(Produto produto){
		if(existe(produto.getCodigo())){
			int i = procurarIndice(produto.getCodigo());
			produtos[i] = produto;
			
		}
	}
	
	public void remover(int codigo){
		int i = 0;
		if(existe(codigo)){
			i = procurarIndice(codigo);
			produtos[i] = produtos[i-1];
			produtos[i - 1] = null;
			indice--;
		}
		
	}
	
	public Produto[] buscarTodosProdutos(){
		
		return produtos;
	}
	

}
