package br.com.foursys.banco.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaIserirAluno {
    public static void main(String[] args) {
	
    	
    	try {
    		Connection bd= ConnectionFactory.getConnection();
        	Aluno a1 = new Aluno("Vitoria","Alphaville",20);
        	AlunoDAO dao = new AlunoDAO(bd);
			dao.inserir(a1);
			System.out.println("Aluno Inserido com Sucesso!!");
			bd.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao inserir Aluno!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    	
}
}
