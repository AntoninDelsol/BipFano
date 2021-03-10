package bipfano;

public class Serveur {
	 //Doit rester private
	 static private Serveur serv;
	 private Serveur () { 
	 }
	 
	 //Singleton
	 public Serveur getInstance() {
		 if (serv == null) {
			 serv= new Serveur();
		 }
		 return serv;
	 }
	
}
