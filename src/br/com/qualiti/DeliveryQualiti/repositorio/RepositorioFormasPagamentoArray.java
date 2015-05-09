package br.com.qualiti.DeliveryQualiti.repositorio;
import br.com.qualiti.DeliveryQualiti.classes.FormaPagamento;


public class RepositorioFormasPagamentoArray {
	private static final int TAMANHO_CACHE = 10;
	private FormaPagamento[] formasPagamento;
	private int indice;
	
	public RepositorioFormasPagamentoArray() {
		formasPagamento = new FormaPagamento[TAMANHO_CACHE];
		indice = 0;
	}
	
	private int procurarIndice(int codigo){
		int posicao = -1;
		
		for(int i = 0;i < indice; i++){
			if(formasPagamento[i].getCodigo() == codigo){
				posicao = i;
				break;
				
			}
			
		}
		
		return posicao;
		
	}
	
	public boolean existe(int codigo){
		return procurarIndice(codigo) != -1;
		
	}
	
	public FormaPagamento procurar(int codigo){
		FormaPagamento retorno = null;
		int indice = 0;
		if(existe(codigo)){
			indice = procurarIndice(codigo);
			retorno = formasPagamento[indice];
			
		}
		
		return retorno;
		
	}
	
	public void inserir(FormaPagamento formaPagamento){
		formasPagamento[indice++] = formaPagamento;
		
	}
	
	public void atualizar(FormaPagamento formaPagamento){
		if(existe(formaPagamento.getCodigo())){
			int i = procurarIndice(formaPagamento.getCodigo());
			formasPagamento[i] = formaPagamento;
		}
	}
	
	
	public void remover(int codigo){
		int i = 0;
		if(existe(codigo)){
			i = procurarIndice(codigo);
			formasPagamento[i] = formasPagamento[indice -1];
			formasPagamento[indice - 1] = null;
			indice--;
		}
		
	}
	public FormaPagamento[] buscarFormasPagamento(){
		
		return formasPagamento;
	}
	
}
