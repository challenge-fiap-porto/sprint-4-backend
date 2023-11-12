package br.com.fiap.bo;

import br.com.fiap.dao.BicicletaDao;
import br.com.fiap.entity.Bicicleta;

public class BicicletaBo {

	private BicicletaDao bicicletaDao;
	
	//inserir
	public void cadastrar(Bicicleta bici) {
		bicicletaDao= new BicicletaDao();
		bicicletaDao.inserir(bici);
	}
	
	
}
