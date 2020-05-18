package codigo;

import java.util.*;

public class ClimaActual {
	private Horario tiempo;
	private AccuWeatherAPI apiClima;
	private static ClimaActual INSTANCE = null;
	List<Map<String, Object>> condicionesClimaticas;
	
	private  void climaActual() {
		tiempo = new Horario();
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
	}
	
	private synchronized static void createInstance() {
		if (INSTANCE == null) { 
		INSTANCE = new ClimaActual();
		}
		}
		 
		public static ClimaActual getInstance() {
		createInstance();
		return INSTANCE;
		}

	public Clima obtener() {
		actualizarClima();
		if(condicionesClimaticas.get(0).get("PrecipitationProbability") == 0)//Devuelve un número del 0 al 1
			return Clima.LLUVIA;
		else
			return Clima.NOLLUVIA;
	}
	
	private void setCondicionesClimaticas() {
		AccuWeatherAPI apiClima2 = new AccuWeatherAPI();
		condicionesClimaticas = apiClima2.getWeather("Buenos Aires, Argentina");
	}
	
	public void actualizarClima() {
		Horario tiempo2 = new Horario();
		if((tiempo2.getHorario()-12)> tiempo.getHorario()) {
			AccuWeatherAPI apiClima2 = new AccuWeatherAPI();
			condicionesClimaticas = apiClima2.getWeather("Buenos Aires, Argentina");
		}
	}
	
}
