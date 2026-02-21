package tp3;

import java.util.*;

public class Patient{
	private String nom ;
	private Set<String > ordonnance ;
	public Patient ( String n){
	nom = n ;
	ordonnance = new HashSet <String>();
	}
	public String getNom () { 
		return nom ;
	}
	public boolean ordonnanceVide (){
		return ordonnance.isEmpty();
	}
	
	public void ajoutMedicament ( String m) {
		ordonnance.add(m);
	}
	public void affiche(){

		System.out.println(nom+" "+ordonnance);
	}
	public boolean contientMedicament (String m) {

		return ordonnance.contains(m);
	}
	public void trieOrdonnace() {
		Set<String>ss= new TreeSet <>(ordonnance);
		ordonnance=ss;
		System.out.println(ordonnance);
	}
}
