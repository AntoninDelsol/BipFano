package bipfano;

import java.sql.Timestamp;

public class Utilisateur {
	private String name;
	
	public Utilisateur(String name) {
		this.name=name;
	}
	
	public void notify(int fano, int lapTime) {
		System.out.println(new Timestamp(System.currentTimeMillis())+" : "+"Le fano numéro "+fano+" vient de terminer son tour en "+lapTime+" seconds");
	}
}
