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
		
		@Test
		public void seGuarda1AtuendoEnGuardaRopa() {
			superior1.setTipo(prendaS);
			inferior1.setTipo(prendaI);
			accesorio1.setTipo(prendaA);
			calzado1.setTipo(prendaC);
			prendas.add(superior1);
			prendas.add(inferior1);
			prendas.add(accesorio1);
			prendas.add(calzado1);
			Usuario usuario1 = new Usuario(prendas);
			usuario1.crearAtuendo();
			assertEquals(1, usuario1.getGuardarropa().size());
		}
		
		@Test 
		public void recomiendoYAceptoRecomendacion() {
			superior1.setTipo(prendaS);
			inferior1.setTipo(prendaI);
			accesorio1.setTipo(prendaA);
			calzado1.setTipo(prendaC);
			prendas.add(superior1);
			prendas.add(inferior1);
			prendas.add(accesorio1);
			prendas.add(calzado1);
			Usuario usuario1 = new Usuario(prendas);
			usuario1.crearAtuendo();
			List<Prenda> prendas2 = new ArrayList();
			Usuario usuario2 = new Usuario(prendas2);
			usuario1.recomendarAgregar(usuario2, usuario1.getGuardarropa().get(0));
			usuario2.aplicarEn(usuario2.getRecomendaciones().get(0));
			assertEquals(0,usuario2.getRecomendaciones().size());
			assertEquals(usuario1.getGuardarropa(), usuario2.getGuardarropa());
		}
		
		
		
}
