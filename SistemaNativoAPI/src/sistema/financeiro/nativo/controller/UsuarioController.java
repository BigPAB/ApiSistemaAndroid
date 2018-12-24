package sistema.financeiro.nativo.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import sistema.financeiro.nativo.service.UsuarioService;

@Path("/user")
public class UsuarioController {
	
	private UsuarioService usuarioService = new UsuarioService();
	
	  @GET
	  @Path("/save")
	  @Produces("application/json")
	  public String cadastrarUsuario(@QueryParam("nome") String nome,
			  					@QueryParam("senha") String senha,
			  					@QueryParam("email") String email) {
		 
		  usuarioService.salvarUsuario(nome, senha, email);
		  
		  return "ok";
	  }
	  
	  @GET
	  @Path("/update")
	  @Produces("application/json")
	  public String updateUsuario(@QueryParam("id") int id,
			  					@QueryParam("nome") String nome,
			  					@QueryParam("senha") String senha,
			  					@QueryParam("email") String email) {
		  
		  usuarioService.updateUsuario(id, nome, senha, email);
		  return "";
	  }
	  
	  @GET
	  @Path("/delete")
	  @Produces("application/json")
	  public String deleteUsuario(@QueryParam("id") int id){
		  
		  usuarioService.deletarUsuario(id);
		  return "";
		  
	  }

}
