package br.com.foursys.banco.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

//classe esta dentro do java util porque é um teste para o meu projeto


public class TestaBanco {
	
   public static void main(String[] args) {
	   String local="jdbc:mysql://localhost/turmas";
	   String login="root";
	   String senha="root";
//	   faz a conecição com o mysql
	   Connection bd= null;

	   

//	 trata a Clss.forName, que vai carregar o Driver na unha   
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver carregado com sucesso!!");
		 
		 bd= (Connection) DriverManager.getConnection(local,login,senha);
		 
		 System.out.println("Conexão Realizada com sucesso!!");
		 
		 bd.close();
		 
		 System.out.println("Conexão encerrada com sucesso!!");
		 
		 
		 
		 
		 
		 
		 
		 
		 
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		System.out.println("Falha ao carregar o Driver");
	} catch (SQLException e) {
		System.out.println("Erro ao conectar!");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	   
	   
}
}
