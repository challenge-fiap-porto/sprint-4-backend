package br.com.fiap.bo;

import br.com.fiap.entity.Login;
import br.com.fiap.dao.LoginDao;

public class LoginBo {

    private LoginDao loginDao;

    // Inserir
    public void cadastrar(Login login) {
        loginDao = new LoginDao();
        loginDao.inserir(login);
    }

 // Fazer login
    public boolean fazerLogin(int cpf, String senha) {
        loginDao = new LoginDao();
        return loginDao.fazerLogin(cpf, senha);
    }
}