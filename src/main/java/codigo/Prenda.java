package codigo;


public class Prenda {
	Tipo tipo;
	Estacion estacion;
	Categoria cat;
	String color;
	String material;
	public boolean esDeEstacion(Estacion est) {
		return est == estacion;
	}
	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

