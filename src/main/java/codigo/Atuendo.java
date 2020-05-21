package codigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import Exceptions.IngresoVacioException;
import Exceptions.ListaVaciaException;

public class Atuendo {
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
	Prenda accesorio;
	List<Prenda> prendas;
	ProveedorClima proovedor;
	
	public Atuendo(List<Prenda> prendas) {
		this.prendas = prendas;
	}
	
	public void generarAtuendo() {
		prendaSuperior = seleccionarPrenda(Categoria.PARTESUPERIOR);
		prendaInferior = seleccionarPrenda(Categoria.PARTEINFERIOR);
		calzado = seleccionarPrenda(Categoria.CALZADO);
		accesorio = seleccionarPrenda(Categoria.ACCESORIOS);
	}
	
	private Prenda seleccionarPrenda(Categoria cat) {
	if(prendas != null) {
	return prendas.stream().filter(p->p.esAptaParaElClima(proovedor.getTemperatura()) && p.combina(prendaSuperior)&& p.getCategoria() == cat).findFirst();
	}
	else {
		throw new ListaVaciaException("no ingreso prendas");
	}
}
}