package sistema.financeiro.nativo.service;

import sistema.financeiro.nativo.dao.UsuarioDAO;
import sistema.financeiro.nativo.modelo.Usuario;

public class UsuarioService {
	private UsuarioDAO usuarioDAO = new UsuarioDAO();

	public void salvarUsuario(String nome, String senha, String email) {
		Usuario usuario = new Usuario(nome, email, senha);
		
		usuarioDAO.salvarUsuario(usuario);
	}

	public void updateUsuario(int id, String nome, String senha, String email) {
		
		usuarioDAO.updateUsuario(id, nome, senha, email);
		
	}

	public void deletarUsuario(int id) {
		usuarioDAO.deleteUsuario(id);
		
	}

	public String fazerLogin(String email, String senha) {
		// TODO Auto-generated method stub
		return usuarioDAO.fazerLogin(email, senha);
	}

}
