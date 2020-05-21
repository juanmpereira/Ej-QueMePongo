package codigo;
import java.util.*;

public class Usuario {
  private List<Prenda> prendas = new ArrayList<Prenda>();
 
  public Usuario() {}
  
  public void agregarPrenda(Prenda p){
	  prendas.add(p);
  }
  
  public Prenda getPrenda(int nro) {
	  return prendas.get(nro);
  }


}
