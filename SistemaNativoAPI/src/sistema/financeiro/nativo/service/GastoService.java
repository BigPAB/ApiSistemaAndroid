package sistema.financeiro.nativo.service;

import java.util.Date;
import java.util.Map;

import sistema.financeiro.nativo.dao.GastosDAO;
import sistema.financeiro.nativo.modelo.Gasto;

public class GastoService {
	
	private GastosDAO gastosDAO = new GastosDAO();
	
	public void salvarGasto( double valor, String tipo) {
	Date data = new Date();
	Gasto gasto = new Gasto(valor, tipo, "", data);
	
	
	
	gastosDAO.salvarGasto(gasto.getId(), gasto);
	}
	
	public Map<Integer, Gasto> retornarGasto () {
	
		
		return gastosDAO.retornarGasto();
	}
	
	  public void updateGasto( int id, double valor, String tipo) {
		  gastosDAO.updateGasto(id, valor, tipo);
	  }
	
	public void deletarGasto(int id) {
		gastosDAO.deletarGasto(id);
	}

	public GastosDAO getGastosDAO() {
		return gastosDAO;
	}

	public void setGastosDAO(GastosDAO gastosDAO) {
		this.gastosDAO = gastosDAO;
	}
	
}
