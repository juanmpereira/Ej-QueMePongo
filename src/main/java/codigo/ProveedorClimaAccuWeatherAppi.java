package codigo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ProveedorClimaAccuWeatherAppi implements ProveedorClima  {
	private AccuWeatherAPI apiClima;
	private static ProveedorClimaAccuWeatherAppi INSTANCE = null;
	static List<Map<String, Object>> condicionesClimaticas;
    Duration periodo = Duration.ofDays(1);
    LocalDate dia;
	
	private void ProveedorClimaAccuWeatherAppi(){
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
		dia = LocalDate.now();
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
	//	return  condicionesClimaticas.get(0).get("Temperature").get("value").toDegrees(); //tomemoslo como que funciona
		//pero en realidad hay que castearlo a mano y es mas un quilombo
		return 20; //supones que retorna los grados
	}
	
	public static void actualizarClima() {
//		Horario tiempo2 = new Horario();
	//		if(LocalDate.now() > dia.plus(periodo)) { //debo ver como funciona el Duration para ver como hacer el if
			AccuWeatherAPI apiClima = new AccuWeatherAPI();
			condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
		}
	}
//}
