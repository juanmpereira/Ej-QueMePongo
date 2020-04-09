package codigo;


public class Prenda {
	Tipo tipo;
	Clima climaPrenda;
	Categoria cat;
	String color;
	String material;
	public Prenda(Clima arg1,Categoria arg2,String arg3,String arg4,Tipo arg5) {
		if (color == " ") {
		throw new NoIngresoVacioException ("debe ingresar un color");
		}
	}

	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

class NoIngresoVacioException extends Exception{
	 new (String msg){
		 super(msg);
	 }
}