package br.com.qualiti.DeliveryQualiti.negocios;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.classes.Produto;
import br.com.qualiti.DeliveryQualiti.interfaces.ICadastroProduto;
import br.com.qualiti.DeliveryQualiti.repositorio.RepositorioProdutosArray;

public class CadastroProdutos implements ICadastroProduto{

	private RepositorioProdutosArray repositorio;

	public CadastroProdutos(RepositorioProdutosArray repositorio) {
		this.repositorio =	 repositorio;

	}

	public void inserir(Produto produto) throws Exception{
		if(validar(produto)){
			repositorio.inserir(produto);
		}
	}

	public void remover(int codigo) throws Exception{
		repositorio.remover(codigo);

	}

	public void atualizar(Produto produto)throws Exception{
		if(validar(produto)){
			repositorio.atualizar(produto);
		}
	}

	public Produto procurar(int codigo)throws Exception{
		return repositorio.procurar(codigo);

	}

	public Produto[] buscarTodosProdutos()throws Exception{
		return repositorio.buscarTodosProdutos();

	}

	public static boolean validar(Produto produto)throws Exception{
		if (produto.getDataValidade()== null) {
			return false;
		}
		
		if (produto.getDataValidade().before(new Date())) {
			return false;
		}
		
		if (produto.getPrecoUnitario() < 0) {
			return false;
		}
		
		if (produto.getNome() == null || produto.getNome().isEmpty()) {
			return false;
		}


		return true;


	}
}
