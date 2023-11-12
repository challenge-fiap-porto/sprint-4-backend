package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.entity.Login;

public class LoginDao {
	
	private Connection conexao;
	
	// Inserir
	public void inserir(Login login) {
		try (Connection conexao = GerenciadorBd.obterConexao();
		     PreparedStatement comandoSql = conexao.prepareStatement("INSERT INTO login (cpf, senha) VALUES (?, ?);")) {

			comandoSql.setInt(1, login.getCpf());
			comandoSql.setString(2, login.getSenha());
			comandoSql.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Fazer login
	public boolean fazerLogin(int cpf, String senha) {
	    try (Connection conexao = GerenciadorBd.obterConexao();
	         PreparedStatement comandoSql = conexao.prepareStatement("SELECT * FROM login WHERE cpf = ? AND senha = ?")) {

	        comandoSql.setInt(1, cpf);
	        comandoSql.setString(2, senha);

	        try (ResultSet rs = comandoSql.executeQuery()) {
	            // Se houver um resultado, significa que o login foi bem-sucedido
	            return rs.next();
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    // Se chegou aqui, significa que o login falhou
	    return false;
	}

