package codigo;

import java.util.*;

public class QMP {
	RepositorioUsuarios repoUsuarios;
	ProovedorClima proovedor = new ProovedorClimaAccuWeatherAppi();
	GeneradorPropuesta generador; 
	
	public QMP(RepositorioUsuarios repo, GeneradorPropuesta generador) {
		this.repoUsuarios = repo;
		this.generador = generador;
	}
	
	
	public void ingresarAlSistema() {
		actualizarAlertas();
		calcularSugerencias();
	}
	
	public void actualizarAlertas() {
		Alerta alertas = proovedor.getAlerta();
		repoUsuarios.getUsuarios().forEach(u->u.seActualizaronAlertas(alertas));
	} 
	
	public void calcularSugerencias() {
		repoUsuarios.getUsuarios().forEach(u-> generador.realizarPropuestas(u,proovedor));
	}
	
}
