package sistema.financeiro.nativo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import sistema.financeiro.nativo.modelo.Gasto;
import sistema.financeiro.nativo.service.GastoService;


@Path("/gasto")
public class GastoController {
	GastoService serviceGasto = new GastoService();
	
	@GET
	  @Produces("application/json")
	  public Response retornarGasto(@QueryParam("id") int id) throws JSONException {
		
		
		
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("Valor: ", serviceGasto.retornarGasto().get(id).getValor()); 
		jsonObject.put("Tipo: ", serviceGasto.retornarGasto().get(id).getTipoGasto());

		String result = "Gasto \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  @Path("/gastos")
	  @GET
	  @Produces("application/json")
	  public Response retornarGastos() throws JSONException {
		String result = "";
		int i = 1;
		Map<Integer, Gasto> listaGastos = new HashMap<Integer, Gasto>();
		listaGastos = serviceGasto.retornarGasto();
		
		JSONObject jsonObject = new JSONObject();
		Gson gson = new Gson();
		//GsonBuilder().disableHtmlEscape().create();
	    String mapToString = gson.toJson(serviceGasto.getGastosDAO().getListaGastos());
		
		while( i<= listaGastos.size()) {
			if(listaGastos.get(i) ==null) {
				System.out.println("Loading...");
			}else {
				jsonObject.put("Valor: ", serviceGasto.retornarGasto().get(i).getValor()); 
				jsonObject.put("Tipo: ", serviceGasto.retornarGasto().get(i).getTipoGasto());
				result = "Gasto \n\n" + jsonObject;
				System.out.println(result);
				
			}
			i++;
			
		}
		System.out.println(mapToString);
		return Response.status(200).entity(mapToString).build();
	  }
	  
	  @GET
	  @Path("/save")
	  @Produces("application/json")
	  public String salvarGasto(
			  					@QueryParam("valorGasto") double valor,
			  					@QueryParam("tipoGasto") String tipo) {
		  

		  serviceGasto.salvarGasto( valor, tipo);
		  return "You enter " + valor + " e " + tipo;
		  
		  
	  }
	  
	  @GET
	  @Path("/update")
	  @Produces("application/json")
	  public void updateGasto(@QueryParam("id") int id,
			  @QueryParam("valorGasto") double valor,
				@QueryParam("tipoGasto") String tipo) {
		  serviceGasto.updateGasto(id, valor, tipo);
	  }
	  
	  @GET
	  @Path("/delete")
	  @Produces("application/json")
	  public void deletarGasto(@QueryParam("id") int id) {
		  serviceGasto.deletarGasto(id);
	  }

}
