package sistema.financeiro.nativo.modelo;

import java.util.Date;

public class Gasto {
	
	private static int id;
	private double valor;
	private String tipoGasto;
	private String obsevacao;
	private Date data;
	
	public Gasto(double valor, String tipoGasto, String obsevacao, Date data) {
		
		this.id++;
		this.valor = valor;
		this.tipoGasto = tipoGasto;
		this.obsevacao = obsevacao;
		this.data = data;
		
		System.out.println(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoGasto() {
		return tipoGasto;
	}

	public void setTipoGasto(String tipoGasto) {
		this.tipoGasto = tipoGasto;
	}

	public String getObsevacao() {
		return obsevacao;
	}

	public void setObsevacao(String obsevacao) {
		this.obsevacao = obsevacao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
}
