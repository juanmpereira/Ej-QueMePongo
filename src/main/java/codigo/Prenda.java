package codigo;


public class Prenda {
	String trama = "lisa";
	Tipo tipo;
	Color color;
	Material material;
	Color colorSecuendario;
	
	public Prenda() {}
/*	public Prenda(Tipo tipo,Clima climaPrenda,Color color,Material material) throws IngresoNoValidoException {
		Preconditions.validateNotNull(color);//hago esto para no repetir codigo
		Preconditions.validateNotNull(tipo);
		Preconditions.validateNotNull(material);
		Preconditions.validateNotNull(climaPrenda);
		this.color=color;
		this.climaPrenda = climaPrenda;
		this.material=material;
	}*/ //esto lo utilizaba si no tenia el borrador
	
	
	public boolean combina(Prenda prenda) {
		if(prenda == null)
		return true;
		else
		return material == prenda.material && color == prenda.color;
	} //como comprobar si combina la prenda o no.

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setColorSecuendario(Color colorSecuendario) {
		this.colorSecuendario = colorSecuendario;
	}

	public String getTrama() {
		return trama;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Color getColor() {
		return color;
	}

	public Material getMaterial() {
		return material;
	}

	public Color getColorSecuendario() {
		return colorSecuendario;
	}

	public boolean esAptaParaElClima(int temperatura) {
		return true;
	}
	

}

