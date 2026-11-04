package Decorator;

public class SmsDecorator extends NotifierDecorator{
	
	public SmsDecorator(Notifier notifier) {
		super(notifier);
	}
	
	@Override
	public void send(String message) {
		super.send(message);
		sendSms(message);
	}
	
	public void sendSms(String message) {
		System.out.println("[SMS] Invio del messaggio SMS in corso con messaggio: " + message);
	}

}
