package bipfano;

import java.util.HashSet;
import java.util.Set;

public class Serveur {
	 //Doit rester private
	 static private Serveur serv;
	 private static final Set<String> names = new HashSet<String>();
	 private static final Set<Integer> numero = new HashSet<Integer>();
	 private Serveur () { 
	 }
	 
	 //Singleton
	 public Serveur getInstance() {
		 if (serv == null) {
			 serv= new Serveur();
		 }
		 return serv;
	 }
	 
	 //enregistrement d'un fano return null si l'enregistrement ne peut etre effectué
	 //ameliorer avec message d'erreur pour les différents echec de création
	 public Fano registerFano(int num) {
		 //verification du numéro entre 1 et 100
		 if (num>0&&num<=100) {
			 //vérification du numéro non existant
			 if (numero.contains(num)) {
				 return null;
			 }else {
				 numero.add(num);
				 return new Fano(num);
			 }
		 }else {
			 return null;
		 }
	 }
	 public Utilisateur createUser(String name) {
		 if (names.contains(name)) {
			 return null;
		 }else {
			 return new Utilisateur(name);
		 }
	 }
	 public boolean subscribeToFano(Utilisateur user, Fano fano) {
		 if (numero.contains(fano.getNumber())) {
			 fano.addUser(user);
			 return true;
		 }else {
			 return false;
		 }
	}
}
