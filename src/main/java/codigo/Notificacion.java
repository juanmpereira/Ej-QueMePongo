package codigo;

public class Notificacion implements LugarAvisos {
	NotificacionService servicio = new NotificacionService();
	
	@Override
	public void notificarAlerta(TipoAlerta alerta) {
		servicio.notify(alerta.aviso());
	}

}
