package br.com.foursys.banco.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

//classe responsavel por efetuar conexao ccom o banco de dados 
public class ConnectionFactory {

//	static- acessar um metodo ou atributo 

	public static Connection getConnection() {

		String local = "jdbc:mysql://localhost/turmas";
		String login = "root";
		String senha = "root";
//		   faz a conecição com o mysql
		Connection conexao = null;

//		 trata a Clss.forName, que vai carregar o Driver na unha   
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conexao = (Connection) DriverManager.getConnection(local, login, senha);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			System.out.println("Falha ao carregar o Driver");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conexao;

	}

}
