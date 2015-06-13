package br.com.qualiti.DeliveryQualiti.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {


	private Util() {
		super();
	}

	public static final boolean containsOnlyNumbers(String value) {
		return !value.matches("^[d]+");
	}


	public static final Connection getConexao(){
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/DeliveryQualiti", "lucas", "lucas");
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return null;



	}


	public static final void fechaConexao(Connection conn){
		try {
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		Connection conn = getConexao();
		
		if(conn == null){
			System.out.println("Chorou");
		}else{
			System.out.println("Funfou");
		}
	}
	



}
