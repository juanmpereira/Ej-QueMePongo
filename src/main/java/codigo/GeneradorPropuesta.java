package codigo;

public class GeneradorPropuesta {
	
		public void realizarPropuestas(Usuario usuario,ProovedorClima proovedor) {
			Atuendo atuendo = new Atuendo (usuario.getPrendas(),proovedor);
			atuendo.generate();
			usuario.actualizarPropuestaDiaria(atuendo);
		}
}
