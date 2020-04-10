package codigo;


public class Prenda {
	String tipo;
	Clima climaPrenda;
	Categoria cat;
	String color;
	String material;
	//hago un constructor para que al ingresar los datos, si ingreso vacio me tire una excepcion pero todavia no se bien como manejarlas
	public Prenda(String arg1,Clima arg2,Categoria arg3,String arg4,String arg5) {
		if (arg4 == " ") {
		try {
			throw new NoIngresoVacioException ();
			}
		catch(NoIngresoVacioException exc) {
			System.out.println("no ingreso un color");
		} } else 
			color = arg4;
		
	
	}

	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

