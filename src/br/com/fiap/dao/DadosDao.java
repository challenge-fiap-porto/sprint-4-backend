package br.com.fiap.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.fiap.entity.Dados;
public class DadosDao {
	
		private Connection conexao;
		
		//inserir
		public void inserir(Dados dados) {
			conexao = GerenciadorBd.obterConexao();
			PreparedStatement comandoSql = null;
			try {
				comandoSql = conexao.prepareStatement("insert into dados (nome,cpf,email,telefone,endereco,idade,genero)"
						+ " values(?, ?, ?, ?, ?, ?, ?);");
				comandoSql.setString(1, dados.getNome());
				comandoSql.setInt(2, dados.getCpf());
				comandoSql.setString(3, dados.getEmail());
				comandoSql.setInt(4, dados.getTelefone());
				comandoSql.setString(5, dados.getEndereco());
				comandoSql.setInt(5, dados.getIdade());
				comandoSql.setString(5, dados.getGenero());
				comandoSql.executeUpdate();
				conexao.close();
				comandoSql.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
