package bipfano;

import java.util.ArrayList;

import javax.swing.Timer;

public class Fano {
	private int number;
	

	private int lapTime;
	private ArrayList<Utilisateur> abo = new ArrayList<Utilisateur>();
	
	public Fano(int number) {
		this.number=number;
		//Timer pour simuler les tours
		new Timer (2000,evt-> notifyall()).start();
	}
	
	//getter/setter pour le temps des tours version test
	public int getLapTime() {
		return lapTime;
	}
	public void setLapTime(int lapTime) {
		this.lapTime = lapTime;
	}
	public int getNumber() {
		return number;
	}
	//Ajoute un utilisateur a liste des abonnés
	public void addUser(Utilisateur user) {
		abo.add(user);
	}
	
	//Notifira tous les utilisateurs abonnés
	public void notifyall() {
		for (Utilisateur u : abo) {
			u.notify(this.number,this.lapTime);
		}
	}
}
