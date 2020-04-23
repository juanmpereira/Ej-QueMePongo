package codigo;

import Exceptions.IngresoVacioException;

public class Uniforme {
		private Prenda superior;
		private Prenda inferior;
		private Prenda calzado;
		
		private Uniforme(Prenda superior, Prenda inferior, Prenda calzado) {
			this.superior = superior;
			this.inferior = inferior;
			this.calzado = calzado;
		}
		
		public void fabricar(Sastre sastre) throws IngresoVacioException {
		Uniforme uniforme = new Uniforme(sastre.fabricarParteSuperior(),  sastre.fabricarParteInferior(), sastre.fabricarCalzado());
	}
}

