package test;
import codigo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

import Exceptions.IngresoNoValidoException;
import Exceptions.IngresoVacioException;

public class PrendasTest {
	private Usuario juan;
	private List<Prenda> prendasJuan;
	private Prenda remera;
	private Categoria prendaSuperior;
	private List<String> tipos;
	
	@Before
	public void inicializate() throws IngresoNoValidoException {
		tipos = new ArrayList<String>(Arrays.asList("remera","buzo","campera"));
		prendaSuperior = new Categoria( tipos , "superior");
		remera = new Prenda("remera",Clima.TEMPLADO,prendaSuperior,"rojo","tela");
		prendasJuan = new ArrayList<Prenda>(Arrays.asList(remera));
		juan = new Usuario(prendasJuan);
		
		
	}
	
	@Test
	public void seAnadeCorrectamenteUnaPrenda() throws IngresoNoValidoException {
		Prenda buzo = new Prenda("buzo",Clima.TEMPLADO,prendaSuperior,"rojo","tela");
		juan.agregarPrenda(buzo);
		assertEquals(buzo, juan.getLista(1));
	}
	
	@Test 
	public void errorPorIngresoVacio() throws IngresoNoValidoException {
		try {
		Prenda campera = new Prenda(null,Clima.TEMPLADO,prendaSuperior,"rojo","tela");
				fail("no puede no ingresar dato");
		}catch(IngresoVacioException e) {
			
		}
	}
	}
