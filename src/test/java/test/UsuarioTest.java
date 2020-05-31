package test;

import java.util.*;

import org.junit.Test;

import codigo.Borrador;
import codigo.Categoria;
import codigo.Color;
import codigo.Material;
import codigo.Prenda;
import codigo.Tipo;
import codigo.Usuario;

public class UsuarioTest {
		List<Prenda> prendas = new ArrayList();
		Prenda superior1 = new Prenda();
		Prenda inferior1 = new Prenda();
		Prenda accesorio1 = new Prenda();
		Prenda calzado1 = new Prenda();
		
		@Test
		public void aVer() {
			prendas.add(superior1);
			prendas.add(inferior1);
			prendas.add(accesorio1);
			prendas.add(calzado1);
			Usuario usuario1 = new Usuario(prendas);
		}
		
}
