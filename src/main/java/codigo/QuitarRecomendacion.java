package codigo;

public class QuitarRecomendacion implements Recomendacion{
	Atuendo atuendo;
	
	public QuitarRecomendacion(Atuendo atuendo) {
		this.atuendo = atuendo;
	}
		
		public void aplicarEn(Usuario usuario) {
			usuario.quitarAtuendo(atuendo);
		}
		
}
