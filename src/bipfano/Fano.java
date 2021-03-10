package bipfano;

import java.util.ArrayList;

public class Fano {
	private int number;
	private int lapTime;
	private ArrayList<Utilisateur> abo = new ArrayList<Utilisateur>();
	
	public Fano(int number) {
		this.number=number;
	}
	
	//getter/setter pour le temps des tours version test
	public int getLapTime() {
		return lapTime;
	}
	public void setLapTime(int lapTime) {
		this.lapTime = lapTime;
	}
	
	//Notifira tous les utilisateurs aboonés
	public void notifyall() {
		for (Utilisateur u : abo) {
			u.notify(this.number,this.lapTime);
		}
	}
}
