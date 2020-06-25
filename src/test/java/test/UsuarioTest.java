package test;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

import codigo.AgregarRecomendacion;
import codigo.Borrador;
import codigo.Categoria;
import codigo.Color;
import codigo.Material;
import codigo.Prenda;
import codigo.Recomendacion;
import codigo.Tipo;
import codigo.Usuario;

public class UsuarioTest {
		List<Prenda> prendas = new ArrayList();
		Prenda superior1 = new Prenda();
		Prenda inferior1 = new Prenda();
		Prenda accesorio1 = new Prenda();
		Prenda calzado1 = new Prenda();
		Tipo prendaS = new Tipo(Categoria.PARTESUPERIOR);
		Tipo prendaI = new Tipo(Categoria.PARTEINFERIOR);
		Tipo prendaA = new Tipo(Categoria.ACCESORIOS);
		Tipo prendaC = new Tipo(Categoria.CALZADO);
		Usuario usuario1;
		
		public UsuarioTest() {
			superior1.setTipo(prendaS);
			inferior1.setTipo(prendaI);
			accesorio1.setTipo(prendaA);
			calzado1.setTipo(prendaC);
			prendas.add(superior1);
			prendas.add(inferior1);
			prendas.add(accesorio1);
			prendas.add(calzado1);
			usuario1 = new Usuario(prendas);
		}
		
		@Test
		public void seGuarda1AtuendoEnGuardaRopa() {
			usuario1.crearAtuendo();
			assertEquals(1, usuario1.getGuardarropa().size());
		}
		
		@Test 
		public void recomiendoYAceptoRecomendacion() {
			usuario1.crearAtuendo();
			List<Prenda> prendas2 = new ArrayList<Prenda>();
			Usuario usuario2 = new Usuario(prendas2);
			Recomendacion recomendacion1 = new AgregarRecomendacion(usuario1.getGuardarropa().get(0));
			usuario2.agregarRecomendacion(recomendacion1);
			usuario2.aplicar(usuario2.getRecomendaciones().get(0));
			assertEquals(0,usuario2.getRecomendaciones().size());
			assertEquals(usuario1.getGuardarropa(), usuario2.getGuardarropa());
		}
		
		
		
}
