package codigo;
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
		superior = (Prenda)  prendas.filter(p->p.cat.reconocedor == "superior");
	}
	public void conseguirInferior(Stream<Prenda> prendas) {
		inferior = (Prenda) this.combinaYEsDe(prendas, "infeior");
	}
	public void conseguirCalzado(Stream<Prenda> prendas) {
		calzado = (Prenda) this.combinaYEsDe(prendas, "calzado");
	}
	public void conseguirAccesorios(Stream<Prenda> prendas) {
		accesorio = (Prenda) this.combinaYEsDe(prendas, "accesorio") ;
	}	
	
	public Stream<Prenda> combinaYEsDe(Stream<Prenda> prendas,String c){
		return prendas.filter(p->p.cat.reconocedor == c && p.combina(superior));
	}

	@Override
	public String toString() {
		return "Atuendo [superior=" + superior + ", inferior=" + inferior + ", calzado=" + calzado + ", accesorio="
				+ accesorio + "]";
	}
	
}

