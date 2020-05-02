package codigo;

import Exceptions.IngresoVacioException;

public class Borrador {
	Prenda prendaEnConstruccion = new Prenda();
	public void especificarTipo(Tipo tipo) throws IngresoVacioException{
		Preconditions.validateNotNull(tipo);
		prendaEnConstruccion.setTipo(tipo);
	}
	public void especificarMaterial(Material material) throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(material);
		prendaEnConstruccion.setMaterial(material);
	}
	
	public void especificarColor(Color color) throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColor(color);
	}
	
	public void especificarColorSecundario(Color color) throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(prendaEnConstruccion.getColor());
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColorSecuendario(color);
	}
	
	public void especificarTrama(String trama) throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(trama);
		prendaEnConstruccion.setTrama(trama);
	}
	
	public void especificarClima(Clima climaPrenda) throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(climaPrenda);
		prendaEnConstruccion.setClimaPrenda(climaPrenda);
	}
	
	public Prenda crearPrenda() throws IngresoVacioException {
		this.validar();
		return prendaEnConstruccion = new Prenda();
	}
	
	void validar() throws IngresoVacioException {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(prendaEnConstruccion.getColor());
		Preconditions.validateNotNull(prendaEnConstruccion.getMaterial());
	}
}
