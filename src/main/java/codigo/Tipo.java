package codigo;

import Exceptions.IngresoVacioException;

public class Tipo {
	Categoria cat;
	public Tipo(Categoria cat) throws IngresoVacioException {
		Preconditions.validateNotNull(cat);
		this.cat = cat;
	}
	public Categoria categoria() {
		return this.cat;
	}
}
