package codigo;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;

public class Atuendo {
	Prenda superior;
	Prenda inferior;
	Prenda calzado;
	Prenda accesorio;
	
	public void armate(Stream<Prenda> prendas) {
		this.conseguirSuperior(prendas);
		this.conseguirInferior(prendas);
		this.conseguirCalzado(prendas);
		this.conseguirAccesorios(prendas);
	}
	
	public void conseguirSuperior(Stream<Prenda> prendas) {
		superior = prendas.findAny(p->p.cat == PRENDASUPERIOR);
	}
	public void conseguirInferior(Stream<Prenda> prendas) {
		inferior = this.combinaYEsDe(prendas, PARTEINFERIOR);
	}
	public void conseguirCalzado(Stream<Prenda> prendas) {
		calzado = this.combinaYEsDe(prendas, CALZADO);
	}
	public void conseguirAccesorios(Stream<Prenda> prendas) {
		accesorio = this.combinaYEsDe(prendas, ACCESORIOS) ;
	}	
	
	public Stream<Prenda> combinaYEsDe(Stream<Prenda> prendas,Categoria c){
		return prendas.findAny(p->p.cat == PRENDAINFERIOR && p.combina(superior));
	}

	@Override
	public String toString() {
		return "Atuendo [superior=" + superior + ", inferior=" + inferior + ", calzado=" + calzado + ", accesorio="
				+ accesorio + "]";
	}
	
}

