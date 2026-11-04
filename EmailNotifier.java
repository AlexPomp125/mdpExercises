package Decorator;

public class EmailNotifier implements Notifier{
	@Override
	public void send(String message) {
		System.out.println("[EMAIL] Invio Email in corso con messaggio: " + message);
	}
}
