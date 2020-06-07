package codigo;

public class Mail implements LugarAvisos  {
		String direcMail;
		MailSender mailSender = new MailSender();
		public Mail(String direcMail) {
			this.direcMail = direcMail;
		}
		
		public void notificarAlerta(TipoAlerta alerta){
			mailSender.send(direcMail, alerta.aviso());
		}

}
