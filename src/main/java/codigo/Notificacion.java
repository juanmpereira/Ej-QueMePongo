package codigo;

public class Notificacion implements Contacto {
	NotificacionService servicio = new NotificacionService();
	
	@Override
	public void notificarAlerta(TipoAlerta alerta) {
		servicio.notify(alerta.aviso());
	}

}
