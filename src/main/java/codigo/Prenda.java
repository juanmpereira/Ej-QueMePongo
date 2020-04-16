package codigo;

import Exceptions.*;

public class Prenda {
	String tipo;
	Clima climaPrenda;
	Categoria cat;
	String color;
	String material;
	String colorSecuendario;
	//hago un constructor para que al ingresar los datos, si ingreso vacio me tire una excepcion pero todavia no se bien como manejarlas
	
	public Prenda(String tipo,Clima climaPrenda,Categoria cat,String color,String material) throws IngresoNoValidoException {
	/*if (color == null) {
		throw new IngresoVacioException("no puede no ingresar dato");
	} else 
		this.color = color;
		*/
		Preconditions.validateNotNull(color);//hago esto para no repetir codigo
		Preconditions.validateNotNull(tipo);
		Preconditions.validateNotNull(cat);
		this.color=color;
		this.climaPrenda = climaPrenda;
		this.cat= cat;
		this.material=material;
		
/*		try{cat.lePertenece(tipo); }
		catch(IngresoNoValidoException ex) {
			System.out.println("error tipo no valido");
			 ex.printStackTrace(System.out);
		}*/ //para esto deberia decir q hacer si no hay exception en categoria
		
		if(cat.lePertenece(tipo)) {
			this.tipo = tipo;
		} else
			throw new IngresoNoValidoException("ingreso tipo no correspondiente a la categoria");
		
	}
	
	//hago el segundo Constructor pues es opcional ingresar color secuendario
	//si tuviese mas condicionales conviene tener un setter para color secundario y un solo constructor sin el
	public Prenda(String tipo,Clima climaPrenda,Categoria cat,String color,String material,String colorSecundario) throws IngresoNoValidoException {
		this(tipo, climaPrenda, cat, color,material);
		this.colorSecuendario=colorSecundario;
	}
	
	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

