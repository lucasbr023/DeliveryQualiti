package br.com.qualiti.DeliveryQualiti.repositorio;
import br.com.qualiti.DeliveryQualiti.classes.Entregador;


public class RepositorioEntregadoresArray {

	private static final int TAMANHO_CACHE = 1000;
	private Entregador[] entregadores;
	private int indice;
	
	public RepositorioEntregadoresArray() {
		entregadores = new Entregador[TAMANHO_CACHE];
		indice = 0;
	}
	
	private int procurarIndice(String matricula){
		int posicao = -1;
		for(int i = 0; i < indice; i++){
			if(entregadores[i].getMatricula().equals(matricula)){
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	public boolean existe(String matricula){
		return procurarIndice(matricula) != -1;
			
	}
	
	public Entregador procurar(String matricula){
		Entregador retorno = null;
		int indice = 0;
		if(existe(matricula)){
			indice = procurarIndice(matricula);
			retorno = entregadores[indice];
			//return entregadores[procurarIndice(matricula)]
		}
		return retorno;
	}
	
	public void inserir(Entregador entregador){
		entregadores[indice++] = entregador;
	}
	
	public void atualizar(Entregador entregador){
		if(existe(entregador.getMatricula())){
			int i = procurarIndice(entregador.getMatricula());
			entregadores[i] = entregador;
			
		}
	}
	
	public void remover(String matricula){
		if(existe(matricula)){
		int i = 0;
			i = procurarIndice(matricula);
			entregadores[i] = entregadores[indice - 1];
			entregadores[indice - 1] = null;
			indice--;
		}
	}
	
	public Entregador[] buscarTodosEntregadores(){
		
		return entregadores;
	}
	
}
