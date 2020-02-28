package br.com.foursys.banco.util;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaExcluirAluno {
public static void main(String[] args) {
		
    	
    	try {
    		Connection bd= ConnectionFactory.getConnection();
        	Aluno a1 = new Aluno("Teste","Santana",25);
        	AlunoDAO dao = new AlunoDAO(bd);
			dao.excluir(a1);
			System.out.println("Aluno excluido com Sucesso!!");
			bd.close();
			
		} catch (SQLException e) {
			System.out.println("Erro ao excluir Aluno!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
