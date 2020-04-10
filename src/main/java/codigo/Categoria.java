package codigo;
import java.util.List;

//public enum Categoria {
	//	PRENDASUPERIOR,PRENDAINFERIOR,CALZADO,ACCESORIOS
//}


public class Categoria{
			List<String> tipos;
			String reconocedor;
			public boolean lePertenece(String tipo) {
				return tipos.contains(tipo);
			}
		}
		
class PrendaSuperior extends Categoria{
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
}