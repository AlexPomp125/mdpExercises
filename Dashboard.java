package Singleton;

public class Dashboard {
	public void mostraBenvenuto() {
		UserSession sessione = UserSession.getInstance();
		System.out.println("Benvenuto " + sessione.getName());
		System.out.println("il tuo ruolo è: " + sessione.getRuolo());
	}
}
