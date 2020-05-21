package codigo;

import Exceptions.IngresoVacioException;

public class Borrador {
	Prenda prendaEnConstruccion = new Prenda();
	
	public void especificarTipo(Tipo tipo) {
		Preconditions.validateNotNull(tipo);
		prendaEnConstruccion.setTipo(tipo);
	}
	public void especificarMaterial(Material material) {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(material);
		prendaEnConstruccion.setMaterial(material);
	}
	
	public void especificarColor(Color color) {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColor(color);
	}
	
	public void especificarColorSecundario(Color color) {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(prendaEnConstruccion.getColor());
		Preconditions.validateNotNull(color);
		prendaEnConstruccion.setColorSecuendario(color);
	}
	
	public void especificarTrama(String trama)  {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(trama);
		prendaEnConstruccion.setTrama(trama);
	}
	
	public Prenda crearPrenda()  {
		this.validar();
		return prendaEnConstruccion;
	}
	
	void validar() {
		Preconditions.validateNotNull(prendaEnConstruccion.getTipo());
		Preconditions.validateNotNull(prendaEnConstruccion.getColor());
		Preconditions.validateNotNull(prendaEnConstruccion.getMaterial());
	}
}
