package codigo;
import java.util.*;

public class Usuario {
  public List<Prenda> prendas;
  public Usuario(List<Prenda> prendas) {
	  this.prendas = prendas;
  }
  
  public void agregarPrenda(Prenda p){
	  prendas.add(p);
  }
  
  public Prenda getLista(int nro) {
	  return prendas.get(nro);
  }


}
