package codigo;

public class Mail implements Contacto  {
		String direcMail;
//		MailSender mailSender = new MailSender();
		
		public Mail(String direcMail) {
			this.direcMail = direcMail;
		}
		
		public void notificar(Alerta alerta){
//			mailSender.send(direcMail, alerta.aviso());
		}

}
