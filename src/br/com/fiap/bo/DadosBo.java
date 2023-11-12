package br.com.fiap.bo;

import br.com.fiap.entity.Dados;
import br.com.fiap.dao.DadosDao;


public class DadosBo {

private DadosDao dadosDao;
	
	//inserir
	public void cadastrar(Dados dado) {
		dadosDao = new DadosDao();
		dadosDao.inserir(dado);
	
}
	
}