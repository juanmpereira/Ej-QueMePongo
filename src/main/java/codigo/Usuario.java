package codigo;
import java.util.*;

public class Usuario {
  private List<Prenda> prendas;
  public Usuario(List<Prenda> prendas) {
	  this.prendas = prendas;
  }
  
  public void agregarPrenda(Prenda p){
	  prendas.add(p);
  }
  
  public Prenda getLista(int nro) {
	  return prendas.get(nro);
  }

 /* public List<Prenda> getPrendas() {
	return prendas;
  }*/ //si fuese privado el atributo prendas

}
