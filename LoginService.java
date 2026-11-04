package Singleton;

public class LoginService {
	public void eseguiLogin() {
		UserSession sessione = UserSession.getInstance();
		sessione.setName("mario");
		sessione.setRuolo("Amministratore");
		System.out.println("Login avvenuto con successo");
	}

}
