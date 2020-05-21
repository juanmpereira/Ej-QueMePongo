package test;
import codigo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.*;

import Exceptions.IngresoNoValidoException;
import Exceptions.IngresoVacioException;

public class PrendasTest {
	private Usuario juan = new Usuario();
	
	@Test
	public void seAnadeCorrectamenteUnaPrenda() throws IngresoNoValidoException {
		Borrador buzoRoja = new Borrador();
		Tipo buzo = new Tipo (Categoria.PARTESUPERIOR);
		buzoRoja.especificarTipo(buzo);
		buzoRoja.especificarColor(Color.ROJO);
		buzoRoja.especificarMaterial(Material.LANA);
		Prenda buzo1 = new Prenda();
		buzo1 =	buzoRoja.crearPrenda();
		juan.agregarPrenda(buzo1);
		assertEquals(buzo1,juan.getPrenda(0));
	}
	
	@Test (expected = IngresoVacioException.class)
	public void errorPorIngresoVacio() throws IngresoVacioException {
		Borrador camperaRoja = new Borrador();
		camperaRoja.especificarColor(Color.ROJO);
		camperaRoja.especificarMaterial(Material.LANA);
		camperaRoja.crearPrenda();
				
	}
	}
