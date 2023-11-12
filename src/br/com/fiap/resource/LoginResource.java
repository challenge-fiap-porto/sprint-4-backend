package br.com.fiap.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.fiap.bo.LoginBo;
import br.com.fiap.entity.Login;

@Path("/login")
public class LoginResource {

    private LoginBo loginBo;

    // Inserir
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cadastrar(Login dado) {
        loginBo = new LoginBo();
        loginBo.cadastrar(dado);
        return Response.ok().build();
    }

 // Fazer login
    @POST
    @Path("/fazerLogin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response fazerLogin(Login dados) {
        loginBo = new LoginBo();
        boolean loginSucesso = loginBo.fazerLogin(dados.getCpf(), dados.getSenha());
        
        System.out.println("tentando login");

        if (loginSucesso) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }
}

