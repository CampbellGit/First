import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class exercice8 {

	public static void main(String[] args) throws IOException {
		
		// Variables
		Scanner sc = new Scanner(System.in);
		String nomfich, nomfichlec;
		int n=0, conteneur, taille, i, j, ajout;
		ArrayList<Integer> db = new ArrayList<Integer>();
		Random rn = new Random();
		
		// Cr�ation du fichier
		System.out.println("Donnez le nom du fichier � cr�er :");
		nomfich = sc.nextLine();
		DataOutputStream sortie = new DataOutputStream
								(new FileOutputStream (nomfich));
		
		// Cr�ation de la liste
		System.out.println("Veuillez indiquer le nombre d'entr�s de votre liste :");
		taille = sc.nextInt();
		for(i =0; i < taille; i++)
		{
		    int answer = rn.nextInt(100);
		    System.out.println(answer);
		    db.add(answer);
		    
		}
		
		// Triage de la liste
		for (i=0; i<taille; i++)
		{
			for (j=0; j<taille-1; j++)
			{
				if (db.get(j+1)<db.get(j))
				{
				conteneur=db.get(j);
				db.set(j,db.get(j+1));
				db.set(j+1,conteneur);
				}
			}
		}
		
		System.out.println("--------------------------");	
		System.out.println("Liste tri�e :");	
		// Affichage de la liste tri�e
		for(i =0; i < taille; i++)
		{
		    System.out.println(db.get(i));
		}
		
		// Entr�e nouvelle valeur et ajout � la fin de liste
		System.out.println("Indiquez le nouvel entier � ajouter : ");		
		db.add(sc.nextInt());
		
		
		// Triage de la nouvelle liste
		taille = db.size();
		for (i=0; i<taille; i++)
		{
			for (j=0; j<taille-1; j++)
			{
				if (db.get(j+1)<db.get(j))
				{
				conteneur=db.get(j);
				db.set(j,db.get(j+1));
				db.set(j+1,conteneur);
				}
			}
		}
		
		// Ecriture de la nouvelle liste
		for(i =0; i < taille; i++)
		{
			sortie.writeInt (db.get(i));
		}
		
		// Affichage du fichier

		DataInputStream entree = new DataInputStream
								(new FileInputStream (nomfich));
		
		System.out.println("Valeurs tri�e lues dans le fichier " +nomfich +" : ");
		boolean eof = false; // fin du fichier
		while (!eof)
		{
			try
			{
				n = entree.readInt();
			}
			catch (EOFException e)
			{
				eof = true;
			}
			if (!eof) System.out.println(n);
			
		}
		entree.close();
		System.out.println("----Fin liste fichier----");

	}
}
