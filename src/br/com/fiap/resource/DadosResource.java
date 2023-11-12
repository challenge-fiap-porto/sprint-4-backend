package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;



import br.com.fiap.bo.DadosBo;
import br.com.fiap.entity.Dados;

@Path("/formulario")
public class DadosResource {

	
private DadosBo dadosBo;
	
	//Inserir
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Dados dado, @Context UriInfo uriInfo) {
		dadosBo = new DadosBo();
		dadosBo.cadastrar(dado);
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		
		
		return Response.created(builder.build()).build();
	}
	
}
	
	//BuscarPorId
	//@GET
	//@Path("/{id}")
	//@Produces(MediaType.APPLICATION_JSON)
	//public Produto buscarPorId(@PathParam("id") int codigo){
		//prodBo = new BicicletaBo();
		//return prodBo.buscarProdutoPorCodigo(codigo);
	//}
	
	//Alterar
	//@PUT
	//@Path(("/{id}")
	//@Consumes(MediaType.APPLICATION_JSON)
	//public Response alterar(Produto prod, @Context UriInfo uriInfo) {
		//prodBo = new BicicletaBo();
		//prodBo.alterar(prod);
		//return Response.ok().build();
	//}
	
	//Excluir
	
	/*public String mensagem() {
		return "Ola";
	}*/