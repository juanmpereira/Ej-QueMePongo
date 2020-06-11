package codigo;

import java.util.*;

public class QMP {
	List<Usuario> usuarios = new ArrayList<Usuario>();
	ProovedorClima proovedor = new ProovedorClimaAccuWeatherAppi();
	
	public void ingresarAlSistema() {
		actualizarAlertas();
		calcularSugerencias();
	}
	
	public void actualizarAlertas() {
		TipoAlerta alerta = proovedor.getAlerta();
		usuarios.forEach(u->enviarAlertas(u,alerta));
	} 
	
	public void enviarAlertas(Usuario usuario, TipoAlerta alerta) {
		usuario.getContactos().forEach(c->c.notificarAlerta(alerta));
	}
	
	public void calcularSugerencias() {
		usuarios.forEach(u-> generadorAtuendos(u));
	}
	
	public void generadorAtuendos(Usuario usuario) {
		Atuendo atuendo = new Atuendo(usuario.getPrendas(), proovedor);
		atuendo.generate();
		usuario.agregarAtuendo(atuendo);	
	}
}
