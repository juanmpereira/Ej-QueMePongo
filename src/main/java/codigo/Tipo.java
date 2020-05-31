package codigo;

import Exceptions.IngresoVacioException;

public class Tipo {
	Categoria cat;
	
	public Tipo(Categoria cat) {
		Preconditions.validateNotNull(cat);
		this.cat = cat;
	}
	public Categoria getCategoria() {
		return this.cat;
	}
}
