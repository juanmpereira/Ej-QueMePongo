package codigo;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ProovedorClimaAccuWeatherAppi implements ProovedorClima  {
	private AccuWeatherAPI apiClima;
	private static ProovedorClimaAccuWeatherAppi INSTANCE = null;
	static List<Map<String, Object>> condicionesClimaticas;
//	Map<String, Object> alertas = apiClima.getAlertas("Buenos Aires"); 
    static Duration periodo = Duration.ofDays(1);
    static LocalDate dia;
    
    public ProovedorClimaAccuWeatherAppi getInstance() {
    	createInstance();
    	return INSTANCE;
    	}

	private void ProveedorClimaAccuWeatherAppi(){
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
		dia = LocalDate.now();
	}
	
	private synchronized static void createInstance() {
		if (INSTANCE == null) { 
		INSTANCE = new ProovedorClimaAccuWeatherAppi();
		}
		actualizarClima();
		}
		 
	@Override
	public int getTemperatura() {
	//	return  condicionesClimaticas.get(0).get("Temperature").get("value").toDegrees(); //tomemoslo como que funciona
		//pero en realidad hay que castearlo a mano y es mas un quilombo
		return 20; //supones que retorna los grados
	}	
	
	public TipoAlerta getAlerta() {
//		return condicionesClimaticas.getAlerts("Buenos Aires");
		return new Granizo();
	}
	
	public static void actualizarClima() {
		LocalDate fechaActual = LocalDate.now();
	//	if( fechaActual.isAfter(dia.plus(periodo)) ) {
			AccuWeatherAPI apiClima = new AccuWeatherAPI();
			condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
			dia = fechaActual;
		}
	}
//}
