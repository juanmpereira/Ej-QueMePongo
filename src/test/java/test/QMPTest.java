package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import codigo.*;


public class QMPTest {
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
	RepositorioUsuarios repo = new RepositorioUsuarios();
	GeneradorPropuesta generador = new GeneradorPropuesta();
	QMP sistema = new QMP(repo,generador);
	
	public QMPTest() {
		superior1.setTipo(prendaS);
		inferior1.setTipo(prendaI);
		accesorio1.setTipo(prendaA);
		calzado1.setTipo(prendaC);
		prendas.add(superior1);
		prendas.add(inferior1);
		prendas.add(accesorio1);
		prendas.add(calzado1);
		usuario1 = new Usuario(prendas);
		repo.AgregarUsuario(usuario1);
		sistema.ingresarAlSistema();
	}
	
	@Test
	public void seHaceRecomendacionDiaria() {
		assertEquals(superior1, usuario1.getPropuestaDiaria().getPrendaSuperior());
		
	}
}
