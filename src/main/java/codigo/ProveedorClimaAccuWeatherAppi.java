package codigo;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class ProveedorClimaAccuWeatherAppi implements ProveedorClima  {
	private AccuWeatherAPI apiClima;
	private static ProveedorClimaAccuWeatherAppi INSTANCE = null;
	List<Map<String, Object>> condicionesClimaticas;
	
	private void ProveedorClimaAccuWeatherAppi(){
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
	}
	
	private synchronized static void createInstance() {
		if (INSTANCE == null) { 
		INSTANCE = new ProveedorClimaAccuWeatherAppi();
		}
		actualizarClima();
		}
		 
	@Override
	public int getTemperatura() {
		createInstance();
		return condicionesClimaticas.get(0).get("Temperature").get("value").toDegrees();
	}
	
	public static void actualizarClima() {
		Horario tiempo2 = new Horario();
			if(Duration.ofDays(1)) { //debo ver como funciona el Duration para ver como hacer el if
			AccuWeatherAPI apiClima = new AccuWeatherAPI();
			condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
		}
	}
}
