package Decorator;

public class Client {
	public static void main(String[] args) {
		String alertMessage = "Attenzione! Rilevato traffico sospetto sul Server!";
		System.out.println("Scenario 1 - solo Email");
		
		Notifier baseNotifier = new EmailNotifier();
		baseNotifier.send(alertMessage);
		
		System.out.println("Scenario 2 - Notificatore multi canale");
		Notifier multiChannel = new SlackDecorator(new SmsDecorator(new EmailNotifier()));
		
		multiChannel.send(alertMessage);
	}
}





// 1. creare l'interfaccia comune Notifier con metodo send da sovrascrivere
// 2. creare il componente concreto EmailNotifier che implementa Notifier e che sovrascrive send con una stampa
// 3. creare il decoratore astratto NotifierDecorator che implementa Notifier e contiene l'oggetto da decorare, costruttore con Notifier notifier e assegnazione 
// con this.oggetto da decorare = notifier; sovrascrittura di send delegando all'oggetto da decorare.send(message)
// 4. decoratore concreto SmsDecorator con costruttore che richiama il super(notifier), override di send con super.send(message) e sendSms(message) con la stampa
// 5. decoratore concreto SlackDecorator con costruttore che richiama il super(notifier), override di send e sendSlack(message) con la stampa
// 6. Client con Stringa di messaggio, scenario 1 solo con allerta tramite notifiche, scenario 2 creazione ed aggregazione del multiCanale con i vari decoratori 
// e Email