package codigo;

import java.util.*;

public class Usuario {
	List<Atuendo> guardarropa;
	List<Prenda> prendas;
	List<Recomendacion> recomendaciones;
	
	public Usuario(List<Prenda> prendas) {
		this.prendas = prendas;
	}
	
	public void agregarAtuendo(Atuendo atuendo) {
		guardarropa.add(atuendo);
	}
	
	public void quitarRecomendacion(Recomendacion recomendacion) {
		recomendaciones.remove(recomendacion);
	}
	
	public void agregarRecomendacion(Recomendacion recomendacion) {
		recomendaciones.add(recomendacion);
	}
	
	public void quitarAtuendo(Atuendo atuendo) {
		guardarropa.remove(atuendo);
	}
	
	public void crearAtuendo() {
		Atuendo atuendo = new Atuendo(this.prendas);
		atuendo.generarAtuendo();
		atuendo.mostrarAtuendo();
		this.agregarAtuendo(atuendo);
	}
	
	public void recomendarAgregar(Usuario usuario,Atuendo atuendo) {
		Recomendacion recomendacion = new AgregarRecomendacion(atuendo); 
		usuario.agregarRecomendacion(recomendacion);
	}
	
	public void recomendarQuitar(Usuario usuario,Atuendo atuendo) {
		Recomendacion recomendacion = new QuitarRecomendacion(atuendo);
		usuario.agregarRecomendacion(recomendacion);
	}

	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}

	public List<Atuendo> getGuardarropa() {
		return guardarropa;
	}

	public List<Recomendacion> getRecomendaciones() {
		return recomendaciones;
	}
	
	public void aplicarEn(Recomendacion recomendacion) {
		recomendacion.aplicarEn(this);
	}
		
}
