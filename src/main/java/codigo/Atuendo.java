package codigo;
import java.util.*;
import java.util.List;

public class Atuendo {
	Prenda superior;
	Prenda inferior;
	Prenda calzado;
	Prenda accesorio;
	
	public void armate(List<Prenda> prendas) {
		this.conseguirSuperior(prendas);
		this.conseguirInferior(prendas);
		this.conseguirCalzado(prendas);
		this.conseguirAccesorios(prendas);
	}
	
	public void conseguirSuperior(List<Prenda> prendas) {
		superior = prendas.stream().findAny(p->p.cat == PRENDASUPERIOR);
	}
	public void conseguirInferior(List<Prenda> prendas) {
		inferior = prendas.stream().findAny(p->p.cat == PRENDAINFERIOR && p.combina(superior));
	}
	public void conseguirCalzado(List<Prenda> prendas) {
		calzado = prendas.stream().findAny(p->p.cat == PRENDAINFERIOR && p.combina(superior));
	}
	public void conseguirAccesorios(List<Prenda> prendas) {
		accesorio = prendas.stream().findAny(p->p.cat == PRENDAINFERIOR && p.combina(superior));
	}
	
}
