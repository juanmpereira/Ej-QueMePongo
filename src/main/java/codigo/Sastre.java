package codigo;

import Exceptions.IngresoVacioException;

public interface Sastre {
	public Prenda fabricarParteSuperior() throws IngresoVacioException;
	public Prenda fabricarParteInferior() throws IngresoVacioException;
	public Prenda fabricarCalzado() throws IngresoVacioException;
}


class SastreSanJuan implements Sastre{
	public Prenda fabricarParteSuperior() throws IngresoVacioException {
		Borrador borrador = new Borrador();
		Tipo chomba = new Tipo(Categoria.PARTESUPERIOR);
		borrador.especificarTipo(chomba);
		borrador.especificarColor(Color.VERDE);
		borrador.especificarMaterial(Material.PIQUE);
		return borrador.crearPrenda();
	}
	public Prenda fabricarParteInferior() throws IngresoVacioException {
		Borrador borrador = new Borrador();
		Tipo pantalon = new Tipo(Categoria.PARTEINFERIOR);
		borrador.especificarTipo(pantalon);
		borrador.especificarColor(Color.GRIS);
		borrador.especificarMaterial(Material.ACETATO);
		return borrador.crearPrenda();
	}
	public Prenda fabricarCalzado() throws IngresoVacioException {
		Borrador borrador = new Borrador();
		Tipo zapatillas = new Tipo(Categoria.CALZADO);
		borrador.especificarTipo(zapatillas);
		borrador.especificarColor(Color.BLANCO);
		borrador.especificarMaterial(Material.CUERO);
		return borrador.crearPrenda();
	}
}