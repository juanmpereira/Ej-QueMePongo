package codigo;

import java.util.ArrayList; 
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import Exceptions.IngresoVacioException;


public class Atuendo {
	Prenda prendaSuperior;
	Prenda prendaInferior;
	Prenda calzado;
	Prenda accesorio;
	List<Prenda> prendas;
	ProovedorClima proovedor;
	
	public Atuendo(List<Prenda> prendas,ProovedorClima proovedor) {
		this.prendas = prendas;
		this.proovedor = proovedor;
	}
	
	public void generate() {
		prendaSuperior = seleccionarPrenda(Categoria.PARTESUPERIOR);
		prendaInferior = seleccionarPrenda(Categoria.PARTEINFERIOR);
		calzado = seleccionarPrenda(Categoria.CALZADO);
		accesorio = seleccionarPrenda(Categoria.ACCESORIOS);
	}
	
	private Prenda seleccionarPrenda(Categoria cat) {
	int temperatura = proovedor.getTemperatura();
	Optional<Prenda> opcional = SonDeCategoria(cat).filter(p->p.esAptaParaElClima(temperatura) && p.combina(prendaSuperior)).findFirst();
	return opcional.get();	
	}

	
	private Stream<Prenda> SonDeCategoria(Categoria cat) {
		return  prendas.stream().filter(p->p.getCategoria() == cat);
	}

	public String mostrarAtuendo() {
		return "Atuendo [prendaSuperior=" + prendaSuperior + ", prendaInferior=" + prendaInferior + ", calzado="
				+ calzado + ", accesorio=" + accesorio + "]";
	}

	public Prenda getPrendaSuperior() {
		return prendaSuperior;
	}
			
}