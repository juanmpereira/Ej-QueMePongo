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
	
	@Test
	public void seAnadeCorrectamenteUnaPrenda()  {
		Borrador buzoRoja = new Borrador();
		Tipo buzo = new Tipo (Categoria.PARTESUPERIOR);
		buzoRoja.especificarTipo(buzo);
		buzoRoja.especificarColor(Color.ROJO);
		buzoRoja.especificarMaterial(Material.LANA);
		Prenda buzo1 = new Prenda();
		buzo1 =	buzoRoja.crearPrenda();
	
	}
	
	@Test (expected = IngresoVacioException.class)
	public void errorPorIngresoVacio() {
		Borrador camperaRoja = new Borrador();
		camperaRoja.especificarColor(Color.ROJO);
		camperaRoja.especificarMaterial(Material.LANA);
		camperaRoja.crearPrenda();
				
	}
	}
