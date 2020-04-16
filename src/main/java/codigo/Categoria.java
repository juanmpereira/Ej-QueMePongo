package codigo;
import java.util.List;

import Exceptions.IngresoNoValidoException;

//public enum Categoria {
	//	PRENDA_SUPERIOR,PRENDA_INFERIOR,CALZADO,ACCESORIOS
//}  //y se usa Categoria.PARTE_SUPERIOR

//DEBERIA HACERLO CON EL ENUM


public class Categoria{
			List<String> tipos;
			String reconocedor;
			public Categoria(List<String> tipos,String reconocedor) {
				this.tipos=tipos;
				this.reconocedor = reconocedor;
			}
			public boolean lePertenece(String tipo) throws IngresoNoValidoException {
				return tipos.contains(tipo);
			}
			public void agregarTipo(String tipo) {
				tipos.add(tipo);
			}
			
		}
		

//no hace falta, lo instancio y listo 
//prendaSuperior = new Catergoria(["remera",..], "superior")

/*class PrendaSuperior extends Categoria{
	List<String> tipos;
	String reconocedor = "superior";
}

class PrendaInferior extends Categoria{
	List<String> tipos;
	String reconocedor = "inferior";
}

class calzado extends Categoria{
	List<String> tipos;
	String reconocedor = "calzado";
}

class Accesorio extends Categoria{
	List<String> tipos;
	String reconocedor = "accesorio";
}*/