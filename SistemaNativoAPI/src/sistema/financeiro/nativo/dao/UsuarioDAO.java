package sistema.financeiro.nativo.dao;

import java.util.HashMap;
import java.util.Map;


import sistema.financeiro.nativo.modelo.Usuario;

public class UsuarioDAO {
	
	private static Map<Integer, Usuario> listaUsuario = new HashMap<Integer, Usuario>();

	public void salvarUsuario(Usuario usuario) {
		listaUsuario.put(usuario.getId(), usuario);
		
		
	}

	public void updateUsuario(int id, String nome, String senha, String email) {
		
		listaUsuario.get(id).setNome(nome);
		listaUsuario.get(id).setSenha(senha);
		listaUsuario.get(id).setEmail(email);
	}

	public void deleteUsuario(int id) {
		listaUsuario.remove(id);
		
	}

	public String fazerLogin(String email, String senha) {
		String retorno = "";

		int i = 0;

		for(i=1;i<=listaUsuario.size();i++) {
			if(listaUsuario.get(i).getEmail().equals(email) && listaUsuario.get(i).getSenha().equals(senha) ){
				retorno = "Login Efetuado com sucesso!";
				
			}else {
				System.out.println("checking...");
			}
			
		}
		
		return retorno;
	}
	
	

}
