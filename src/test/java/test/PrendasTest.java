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
	private Usuario juan;
	private List<Prenda> prendasJuan;
	private Borrador remeraRoja;
	private Categoria prendaSuperior;
	
	@Before
	public void inicializate() throws IngresoNoValidoException {
		Tipo remera  = new Tipo (Categoria.PARTESUPERIOR);
		remeraRoja = new Borrador();
		remeraRoja.especificarTipo(remera);
		remeraRoja.especificarClima(Clima.NOLLUVIA);
		remeraRoja.especificarColor(Color.ROJO);
		remeraRoja.especificarMaterial(Material.LANA);
		prendasJuan = new ArrayList<Prenda>();
		prendasJuan.add(remeraRoja.crearPrenda());
		juan = new Usuario(prendasJuan);
		
	}
	
	@Test
	public void seAnadeCorrectamenteUnaPrenda() throws IngresoNoValidoException {
		Borrador buzoRoja = new Borrador();
		Tipo buzo = new Tipo (Categoria.PARTESUPERIOR);
		buzoRoja.especificarTipo(buzo);
		buzoRoja.especificarClima(Clima.NOLLUVIA);
		buzoRoja.especificarColor(Color.ROJO);
		buzoRoja.especificarMaterial(Material.LANA);
		Prenda buzoRojo = buzoRoja.crearPrenda();
		juan.agregarPrenda(buzoRojo);
		//assertEquals(buzoRojo, juan.getLista(1));
	}
	
	@Test 
	public void errorPorIngresoVacio() throws IngresoNoValidoException {
		try {
		Borrador camperaRoja = new Borrador();
		camperaRoja.especificarClima(Clima.NOLLUVIA);
		camperaRoja.especificarColor(Color.ROJO);
		camperaRoja.especificarMaterial(Material.LANA);
				fail("no puede no ingresar dato");
		}catch(IngresoVacioException e) {
			
		}
	}
	}
