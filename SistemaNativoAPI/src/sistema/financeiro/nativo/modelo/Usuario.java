package sistema.financeiro.nativo.modelo;

import java.util.List;

public class Usuario {

	
	private static int id;
	private String nome;
	private String email;
	private String senha;
	private List<Gasto> gastos;
	
	public Usuario(int id, String nome, String email, String senha, List<Gasto> gastos) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.gastos = gastos;
	}
	
	public Usuario( String nome, String email, String senha) {
		super();
		Usuario.id++;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Gasto> getGastos() {
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}
	
	
	
}
