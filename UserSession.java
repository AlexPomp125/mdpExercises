package Singleton;

public class UserSession {
	private static UserSession instance;
	
	private String name = "Guest";
	private String ruolo = "Visitatore";
	
	private UserSession() {
		this.name = "Guest";
		this.ruolo = "Visitatore";
	}
	
	public static synchronized UserSession getInstance() {
		if(instance == null) {
			instance = new UserSession();
		}
		return instance;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
}
