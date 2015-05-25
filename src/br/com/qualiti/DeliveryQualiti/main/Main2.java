package br.com.qualiti.DeliveryQualiti.main;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.classes.Entregador;
import br.com.qualiti.DeliveryQualiti.negocios.Fachada;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setCpf("12345678912");
		cliente.setCelular("97869803");
		cliente.setTelefone("32286151");
		cliente.setDataNascimento(new Date());
		cliente.setEmail("lmc3@cin.ufpe.br");
		
		Entregador entregador = new Entregador();
		entregador.setNome("Teste");
		
				
		
		
		try{
			Fachada.getInstancia().inserirCliente(cliente);
			Fachada.getInstancia().inserirEntregador(entregador);
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
