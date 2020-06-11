package codigo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void AgregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
