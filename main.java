package tp3;

import java.util.Collection;

public class main {
    public static void main(String[] args) {

        DossierPharmacie dossier = new DossierPharmacie("Pharmacie Centrale");

        dossier.nouveauPatient("Alice", new String[]{"Paracetamol", "Ibuprofene", "Amoxicilline"});
        dossier.nouveauPatient("Bob", new String[]{"Paracetamol", "Doliprane"});
        dossier.nouveauPatient("Yesmine", new String[]{"Amoxicilline", "Vitamines"});

        dossier.affiche();

        dossier.affichePatient("Alice");

        boolean result = dossier.ajoutMedicament("Bob", "Aspirine");
        System.out.println("Ajout réussi : " + result);


        Collection<String> patients = dossier.affichePatientAvecMedicament("Paracetamol");
        System.out.println(patients);
    }
}