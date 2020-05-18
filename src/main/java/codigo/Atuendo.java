package codigo;

import java.util.List;

public class Atuendo {
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
	Prenda accesorio;
	ClimaActual clima;
	
	public Atuendo(Usuario usuario) {
		prendaSuperior = seleccionarPrenda(usuario,Categoria.PARTESUPERIOR);
		prendaInferior = seleccionarPrenda(usuario,Categoria.PARTEINFERIOR);
		calzado = seleccionarPrenda(usuario,Categoria.CALZADO);
		accesorio = seleccionarPrenda(usuario,Categoria.ACCESORIOS);
	}
	
	public Prenda seleccionarPrenda(Usuario usuario,Categoria cat) {
		if (cat == Categoria.PARTESUPERIOR) 
		return  ((List<Prenda>) usuario.prendas.stream().filter(p->p.getClimaPrenda() == clima.obtener())).get(0);
		else
		return  ((List<Prenda>) usuario.prendas.stream().filter(p->p.getClimaPrenda() == clima.obtener() && p.combina(prendaSuperior))).get(0);
	}
}
