package br.com.foursys.banco.util;


import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;

import br.com.foursys.banco.dao.AlunoDAO;
import br.com.foursys.banco.model.Aluno;

public class TestaBuscarTodos {

	public static void main(String[] args) throws SQLException {
		
		Connection bd = ConnectionFactory.getConnection();
		AlunoDAO dao = new AlunoDAO(bd);
		try {
			List<Aluno> alunos = dao.buscarTodos();
			for (Aluno aluno : alunos) {
				System.out.println("Nome:"+aluno.getNome());
				System.out.println("Cidade:"+aluno.getCidade());
				System.out.println("Idade"+aluno.getIdade());
			}
			bd.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível exibir alunos");
			
		}	
		
	}
	
	
	
	
	
	
	
	
}
