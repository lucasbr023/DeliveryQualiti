package br.com.qualiti.DeliveryQualiti.main;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.classes.Endereco;
import br.com.qualiti.DeliveryQualiti.negocios.Fachada;

public class Main2 {

	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Lucas");
		cliente.setCpf("10758480407");
		cliente.setEmail("lmc3@cin.ufpe.br");
		cliente.setCelular("111222111221");
		cliente.setTelefone("111222111222");
		cliente.setDataNascimento(new Date());
		Endereco endereco = new Endereco();
		endereco.setBairro("Cordeiro");
		endereco.setCep("50630650");
		endereco.setCidade("Recife");
		endereco.setComplemento("proximo a minha casa");
		endereco.setEstado("PE");
		endereco.setLogradouro("rua cardeal dom augusto");
		endereco.setNumero("914");
		cliente.setEndereco(endereco);

		try {
			Fachada fachada = Fachada.getInstancia();
			fachada.inserirCliente(cliente);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
