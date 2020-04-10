package codigo;
import java.util.stream.Stream;

public class Negocio {
	Usuario usuario;
	Clima climaActual;
	Atuendo atuendo;
	public Stream<Prenda> sonParaElClima(){
		return usuario.prendas.stream().filter(p->p.climaPrenda == climaActual);
	}
	public void armarAtuendo() {
		atuendo.armate(this.sonParaElClima());
	}
	

	public void mostrarAtuendo() {
		atuendo.toString();
	}
}
