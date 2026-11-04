package Singleton;

public class Main {
	public static void main(String[] args) {
		LoginService login = new LoginService();
		Dashboard dashboard = new Dashboard();
		login.eseguiLogin();
		System.out.println("------------------");
		dashboard.mostraBenvenuto();
	}

}
