package sistema.financeiro.nativo.controller;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


import sistema.financeiro.nativo.service.UsuarioService;

@Path("/log")
public class LoginController {
	UsuarioService usuarioService = new UsuarioService();
	
    @GET
    @Path("/user")
    @Produces(MediaType.APPLICATION_JSON)
	public String logarUsuario(
				@QueryParam("email") String email,
				@QueryParam("senha") String senha) {


    	return usuarioService.fazerLogin(email, senha);
    	


}




}
