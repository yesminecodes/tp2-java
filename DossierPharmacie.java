package tp3;

import java.util.*;

public class DossierPharmacie{
	private String nom ;
	private HashMap <String , Patient > patients ;
	public DossierPharmacie ( String n){
	nom =n;
	patients = new HashMap <String , Patient >();
	}
	void nouveauPatient ( String nom , String [] ord ){
		if (!patients.containsKey(nom)) {
			Patient p = new Patient(nom);
			for (String m:ord) {
				p.ajoutMedicament(m);
			}
			patients.put(nom,p);
		}
	}
	public boolean ajoutMedicament(String nom, String m) {
		if (!patients.containsKey(nom)) {
			return false;
		}
		patients.get(nom).ajoutMedicament(m);
		return true;
	}
	public void affichePatient (String nom){
		patients.get(nom).affiche();
	}
	public void affiche (){
		System.out.println("Le nom de la pharmacie: "+nom);
		for (Patient p : patients.values()) {
			p.affiche();
		}
	}
	public Collection<String> affichePatientAvecMedicament(String m) {
		Collection<String> avec = new ArrayList<>();
		for (Patient p : patients.values()) {
			if (p.contientMedicament(m)) {
				avec.add(p.getNom());
			}
		}
		return avec;
	}
}
