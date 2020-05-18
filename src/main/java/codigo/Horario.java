package codigo;

import java.util.*;

public class Horario {
	Calendar calendario = new GregorianCalendar();
	int hora, minutos, segundos,dia,mes,anio;
	 
	public Horario() {
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		dia = calendario.get(Calendar.DAY_OF_MONTH);
		mes = calendario.get(Calendar.MONTH);
		anio = calendario.get(Calendar.YEAR);
	}
	public int getHora() {
		return hora;
	}

	public int getMinutos() {
		return minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public int getDia() {
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public int getHorario() {
	return  anio+mes+dia+hora+minutos+segundos;
	}
	
	
}
