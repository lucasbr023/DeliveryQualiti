package br.com.qualiti.DeliveryQualiti.main;

import java.util.Date;

import br.com.qualiti.DeliveryQualiti.classes.Cliente;
import br.com.qualiti.DeliveryQualiti.classes.Endereco;
import br.com.qualiti.DeliveryQualiti.negocios.Fachada;



public class TesteDeliveryQualiti {
	private static final String[] nomesClientes = {"Jo�o", "Jos�", "Antonio", "Fulano", "Oromar", "Maria", "Joana", "Sicrano"};
	private static final String[] sobreNomesClientes = {"Melo", "Dantas", "Silva", "Barbosa", "Pereira", "Souza", "Vieira", "N�o sei o que"};
	private static final String[] servidoresEmail = {"hotmail.com", "gmail.com", "bol.com.br", "ig.com.br", "x.com", "z.com", "uol.com.br", "N�o sei o que.com"};
	private static final String[] numerais = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	private static final Fachada  fachada = Fachada.getInstancia();

	public static void main(String[] args) {
		
		Cliente c = null;
		Cliente cliente = null;
		String nomeCliente = null;
		String sobreNomeCliente = null;
		String cpf = null;
		String nomeEmail = null;
		String servidorEmail = null;
		String telefone = null;
		for (int j = 0; j < 10; j++){
			
			int i = (int) (Math.random() * nomesClientes.length -1 ) + 1;
			nomeCliente = nomesClientes[i];
			
			i = (int) (Math.random() * sobreNomesClientes.length -1 ) + 1;
			sobreNomeCliente = sobreNomesClientes[i];
			
			cliente = new Cliente();
			cliente.setNome(nomeCliente + " " + sobreNomeCliente) ;
			
			cpf = "";
			for (int x =0; x < 11; x++) {
				i = (int) (Math.random() * numerais.length -1 ) + 1;
				cpf += numerais[i];
			}
			cliente.setCpf(cpf);
			
			cliente.setDataNascimento(new Date());
			
			i = (int) (Math.random() * nomesClientes.length -1 ) + 1;
			nomeEmail = nomesClientes[i].toLowerCase(); 
			
			i = (int) (Math.random() * servidoresEmail.length -1 ) + 1;
			servidorEmail = servidoresEmail[i];
			
			cliente.setEmail( nomeEmail + "@" + servidorEmail);
			
			telefone = "";
			
			for (int x =0; x < 9; x++) {
				i = (int) (Math.random() * numerais.length -1 ) + 1;
				telefone += numerais[i];
			}
			cliente.setTelefone(telefone);
			cliente.setCelular(new StringBuffer(telefone).reverse().toString());
			
			Endereco endereco = new Endereco();
			endereco.setLogradouro("X");
			cliente.setEndereco(endereco);
			
			try {
				fachada.inserirCliente(cliente);
				c = fachada.procurarCliente(cliente.getCpf());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
			System.out.println(c.getNome() + " - " + c.getCpf() + " - " + c.getEmail() + " - " + c.getTelefone());
		}
	}
}

