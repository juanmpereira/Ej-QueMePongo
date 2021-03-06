package codigo;

import java.util.*;

import Exceptions.NoExisteException;

public class Usuario {
	List<Atuendo> guardarropa = new ArrayList<Atuendo>();
	List<Prenda> prendas = new ArrayList<Prenda>();
	List<Recomendacion> recomendaciones = new ArrayList<Recomendacion>();
	List<Recomendacion> recomendacionesAceptadas = new ArrayList<Recomendacion>();
	List<InteresadoObserver> interesados = new ArrayList<InteresadoObserver>();
	Contacto medioContacto;
	Atuendo propuestaDiaria;
	
	public Contacto getMedioContacto() {
		return medioContacto;
	}
	
	public Atuendo getPropuestaDiaria() {
		return propuestaDiaria;
	}

	public void setMedioContacto(Contacto medioContacto) {
		this.medioContacto = medioContacto;
	}

	public void seActualizaronAlertas(Alerta alerta) {
		interesados.forEach(i->i.notificarAlertas(this,alerta));
	}
	
	public void agregarInteresado(InteresadoObserver interesado) {
		interesados.add(interesado);
	}
	
	public void quitarInteresado(InteresadoObserver interesado) {
		interesados.remove(interesado);
	}
	
	public void actualizarPropuestaDiaria(Atuendo atuendo){
		propuestaDiaria = atuendo;
	}
	
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
		ProovedorClima proovedor = new ProovedorClimaAccuWeatherAppi();
		Atuendo atuendo = new Atuendo(this.prendas,proovedor.getInstance());
		atuendo.generate();
		agregarAtuendo(atuendo);
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
	
	public void aplicar(Recomendacion recomendacion) {
		recomendacion.aplicarEn(this);
		quitarRecomendacion(recomendacion);
		agregarAceptada(recomendacion);
	}
	
	public void agregarAceptada(Recomendacion recomendacion) {
		recomendacionesAceptadas.add(recomendacion);
	}
	
	public void eliminarAceptada(Recomendacion recomendacion) {
		recomendacionesAceptadas.remove(recomendacion);
	}
	
	public void deshacer(Recomendacion recomendacion) {
		if (recomendacionesAceptadas.contains(recomendacion)) {
			recomendacion.volverAtras(this);
			recomendacionesAceptadas.remove(recomendacion);
		}
		else 
		new NoExisteException("no se puede deshacer algo que no se acepto");
	}

	public List<Prenda> getPrendas() {
		return prendas;
	}
	
}
