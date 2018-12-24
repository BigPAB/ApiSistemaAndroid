package sistema.financeiro.nativo.dao;

import java.util.HashMap;
import java.util.Map;


import sistema.financeiro.nativo.modelo.Gasto;

public class GastosDAO {
	
	
	private static Map<Integer, Gasto> listaGastos = new HashMap<Integer, Gasto>();
	
	public void salvarGasto (int id, Gasto gasto) {
		listaGastos.put(id, gasto);
		System.out.println("Salvou");
		System.out.println(id);
		
	}
	
	public void updateGasto (int id, double valor, String tipo) {
		listaGastos.get(id).setValor(valor);
		listaGastos.get(id).setTipoGasto(tipo);
		
	}

	public Map<Integer, Gasto> retornarGasto () {
	
		
		return listaGastos;
	}
	
	public void deletarGasto(int id) {
		listaGastos.remove(id);
	}

	public static Map<Integer, Gasto> getListaGastos() {
		return listaGastos;
	}

	public static void setListaGastos(Map<Integer, Gasto> listaGastos) {
		GastosDAO.listaGastos = listaGastos;
	}
	
	
}
