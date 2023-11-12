package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import br.com.fiap.entity.Bicicleta;

public class BicicletaDao {
	
	private Connection conexao;
	
	//inserir
	public void inserir(Bicicleta bike) {
		conexao = GerenciadorBd.obterConexao();
		PreparedStatement comandoSql = null;
		try {
			comandoSql = conexao.prepareStatement("insert into bicicletasprint (numeroserie,anofabricacao,modelo,cor,avarias)"
					+ " values(?, ?, ?, ?,?);");
			comandoSql.setInt(1, bike.getNumeroSerie());
			comandoSql.setInt(2, bike.getAnoFabricacao());
			comandoSql.setString(3, bike.getModelo());
			comandoSql.setString(4, bike.getCor());
			comandoSql.setString(5, bike.getAvarias());
			comandoSql.executeUpdate();
			conexao.close();
			comandoSql.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}
