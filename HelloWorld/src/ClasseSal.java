import java.util.ArrayList;

public class ClasseSal {

	public int matricule;
	private String nom;
	private int salaire;

	// ************* ACCESSEURS *************

	// Retourne le matricule
	public int getMatricule() {
		return matricule;
	}

	public String getNom() {
		return nom;
	}

	public int getSalaire() {
		return salaire;
	}
	public String toString() {
		  return "Employ� : " + nom + ", " + matricule + "," +salaire;
		}

	// ************* MUTATEURS *************

	// D�finit le matricule
	public void setMatricule(int _Matricule) {
		matricule = _Matricule;
	}
	
	// D�finit le nom
	public void setNom(String _Nom) {
		nom = _Nom;
	}

	public void setSalaire(int _salaire) {
		salaire = _salaire;
	}

	public static void sort(ArrayList<ClasseSal> matricule2) {
		// TODO Auto-generated method stub
		
	}



	
	
	
	
	
	
	
}