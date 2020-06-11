package codigo;

public class ClimaObserver implements InteresadoObserver{

	@Override
	public void notificarAlertas(Usuario usuario, Alerta alerta) {
		usuario.getMedioContacto().notificarAlerta(alerta);
	}
	
}
