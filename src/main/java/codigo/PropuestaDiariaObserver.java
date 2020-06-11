package codigo;

public class PropuestaDiariaObserver implements InteresadoObserver {
	ProovedorClima proovedor = new ProovedorClimaAccuWeatherAppi();
	GeneradorPropuesta generador; 
	
	@Override
	public void notificarAlertas(Usuario usuario, Alerta alerta) {
		generador.realizarPropuestas(usuario, proovedor);	
	}

}
