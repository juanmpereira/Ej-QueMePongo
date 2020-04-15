package codigo;

import Exceptions.*;

public class Prenda {
	String tipo;
	Clima climaPrenda;
	Categoria cat;
	String color;
	String material;
	//hago un constructor para que al ingresar los datos, si ingreso vacio me tire una excepcion pero todavia no se bien como manejarlas
	public Prenda(String tipo,Clima climaPrenda,Categoria cat,String color,String material) throws IngresoNoValidoException {
		if (color == " ") {
		throw new IngresoVacioException("no puede no ingresar dato");
	} else 
		this.color = color;
		
		this.climaPrenda = climaPrenda;
		this.cat= cat;
		if(cat.lePertenece(tipo)) 
		throw new IngresoNoValidoException("el tipo no pertenece a la categoria");
		else
			this.tipo = tipo;	
	}
	
	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

