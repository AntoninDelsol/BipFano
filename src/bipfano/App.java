package bipfano;

import java.lang.Thread;
public class App {

	public static void main(String[] args) {
		System.out.println("AnotherFano - V1.1");
		
		Serveur serv = Serveur.getInstance();
		
		Fano fano46 = serv.registerFano(46);
		fano46.setLapTime(1);
		Fano fano10 = serv.registerFano(10);
		fano10.setLapTime(2);
		
		Utilisateur user1= serv.createUser("Premier");
		serv.subscribeToFano(user1, fano46);
		Utilisateur user2= serv.createUser("Second");
		serv.subscribeToFano(user1, fano10);
		serv.subscribeToFano(user1, fano46);
		try {
			Thread.sleep(10000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
