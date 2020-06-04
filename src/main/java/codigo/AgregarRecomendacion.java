package codigo;

public class AgregarRecomendacion implements Recomendacion{
		Atuendo atuendo;
		
		public AgregarRecomendacion(Atuendo atuendo) {
			this.atuendo = atuendo;
		}
		
		public void aplicarEn(Usuario usuario) {
			usuario.agregarAtuendo(atuendo);
		}
		
		public void volverAtras(Usuario usuario) {
			Recomendacion recomendacion = new QuitarRecomendacion(atuendo);
			recomendacion.aplicarEn(usuario);
		}
}
