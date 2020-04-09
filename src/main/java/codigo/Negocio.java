package codigo;
import java.util.*;

public class Negocio {
	Usuario usuario;
	Estacion estacion;
	Atuendo atuendo;
	/*public List<Prenda> sonDeEstacion(List<Prenda> prendas){
		return prendas.stream().filter(p->p.esDeEstacion(estacion));
	}*/
	public void armarAtuendo() {
		//atuendo.armate(this.sonDeEstacion(usuario.prendas));
		atuendo.armate(usuario.prendas.stream().filter(p->p.esDeEstacion(estacion)));
	}
}
