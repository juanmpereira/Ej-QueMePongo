package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import codigo.Atuendo;
import codigo.Categoria;
import codigo.Prenda;
import codigo.ProovedorClima;
import codigo.ProovedorClimaAccuWeatherAppi;
import codigo.Tipo;
import codigo.Usuario;

public class AtuendoTest {
	
	List<Prenda> prendas = new ArrayList();
	Prenda superior1 = new Prenda();
	Prenda inferior1 = new Prenda();
	Prenda accesorio1 = new Prenda();
	Prenda calzado1 = new Prenda();
	Tipo prendaS = new Tipo(Categoria.PARTESUPERIOR);
	Tipo prendaI = new Tipo(Categoria.PARTEINFERIOR);
	Tipo prendaA = new Tipo(Categoria.ACCESORIOS);
	Tipo prendaC = new Tipo(Categoria.CALZADO);
	ProovedorClima proovedor = new ProovedorClimaAccuWeatherAppi();
	
	@Test
	public void crearAtuendo() {
		superior1.setTipo(prendaS);
		inferior1.setTipo(prendaI);
		accesorio1.setTipo(prendaA);
		calzado1.setTipo(prendaC);
		prendas.add(superior1);
		prendas.add(inferior1);
		prendas.add(accesorio1);
		prendas.add(calzado1);
		Atuendo atuendo1 = new Atuendo(prendas,proovedor.getInstance());
		atuendo1.generate();
		assertEquals(superior1, atuendo1.getPrendaSuperior());
	}
}
