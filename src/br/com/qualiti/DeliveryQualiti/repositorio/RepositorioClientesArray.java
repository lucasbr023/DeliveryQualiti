package br.com.qualiti.DeliveryQualiti.repositorio;
import br.com.qualiti.DeliveryQualiti.classes.Cliente;


public class RepositorioClientesArray {

	private static final int TAMANHO_CACHE = 1000;
	private Cliente[] clientes;
	private int indice;
	
	//CRUD
	//CREATE, READ, UPDATE, DELETE
	//construtor criando um array de Cliente com o tamanho 
	//fixo de no maximo 1000 clientes
	public RepositorioClientesArray() {
		clientes = new Cliente[TAMANHO_CACHE];
		indice = 0;
	}
	
	//procurar um Cliente no array usando como parametro o cpf
	private int procurarIndice(String cpf){
		
		//posição = -1 é uma situação impossivel para esse caso, 
		//serve para caso não se encontre um cliente no array.
		int posicao = -1;
		
		//percorrendo o array ate o indice que é o ultimo cliente added
		for(int i = 0; i < indice; i++){
			
			if(clientes[i].getCpf().equals(cpf)){
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	//falar se existe ou não o cliente a partir do cpf
	public boolean existe(String cpf){
		return procurarIndice(cpf) != -1;
	}
	
	//
	public Cliente procurar(String cpf){
		Cliente retorno = null;
		int indice = 0;
		if (existe(cpf)){
			
			indice = procurarIndice(cpf);
			retorno = clientes[indice];
		}
		return retorno;
		
	}
	
	//processo de add um Cliente, aumentando assim o indice
	public void inserir(Cliente cliente){
		clientes[indice++] = cliente;
		
	}
	
	public void atualizar(Cliente cliente){
		if(existe(cliente.getCpf())){
			int i = procurarIndice(cliente.getCpf());
			clientes[i] = cliente;
		}
	}

	public void remover(String cpf){
		int i = 0;
		if(existe(cpf)){
			i = procurarIndice(cpf);
			clientes[i] = clientes[indice - 1];
			clientes[indice - 1] = null;
			indice--;
		}
	}
	
	
	public Cliente[] buscarTodosClientes() {
		return clientes;
	}
}

