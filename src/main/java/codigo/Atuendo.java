package codigo;

import java.util.List;
import java.util.Optional;

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
		return  usuario.prendas.stream().filter(p->p.getClimaPrenda() == clima.obtener()).findFirst();
		else
		return  usuario.prendas.stream().filter(p->p.getClimaPrenda() == clima.obtener() && p.combina(prendaSuperior)).findFirst();
	}
}
