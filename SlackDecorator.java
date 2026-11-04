package Decorator;

public class SlackDecorator extends NotifierDecorator{
	
	public SlackDecorator(Notifier notifier) {
		super(notifier);
	}
	
	public void send(String message) {
		super.send(message);
		sendSlack(message);
	}
	
	public void sendSlack(String message) {
		System.out.println("[SLACK] Invio notifica sul canale aziendale Slack: " + message);
	}
}
