package codigo;

import Exceptions.IngresoVacioException;

public class Borrador {
	Prenda prendaEnConstruccion;
	void especificarTipo(Tipo tipo) throws IngresoVacioException{
		Preconditions.validateNotNull(tipo);
		prendaEnConstruccion.setTipo(tipo);
	}
	void especificarMaterial(Material material) throws IngresoVacioException {
		Preconditions.validateNotNull(material);
		prendaEnConstruccion.setMaterial(material);
	}
	
	void especificarColor(Color color) throws IngresoVacioException {
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColor(color);
	}
	
	void especificarColorSecundario(Color color) throws IngresoVacioException {
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColorSecuendario(color);
	}
	
	void especificarTrama(String trama) throws IngresoVacioException {
		Preconditions.validateNotNull(trama);
		prendaEnConstruccion.setTrama(trama);
	}
	
	void especificarClima(Clima climaPrenda) throws IngresoVacioException {
		Preconditions.validateNotNull(climaPrenda);
		prendaEnConstruccion.setClimaPrenda(climaPrenda);
	}
	
	Prenda crearPrenda() {
		this.validar();
		return prendaEnConstruccion = new Prenda();
	}
	
	void validar() {
		if()
	}
}
