package codigo;

import Exceptions.IngresoVacioException;

//import Exceptions.IngresoVacioException;

public class Preconditions {
	
	public static void validateNotNull (Object value) throws IngresoVacioException{
		if (value == null)
		throw new IngresoVacioException("no puede no ingresar dato");
	}
}
