package codigo;


public class Prenda {
	Tipo tipo;
	Clima climaPrenda;
	Categoria cat;
	String color;
	String material;

	public boolean combina(Prenda prenda) {
		return material == prenda.material && color == prenda.color;
	}
}

