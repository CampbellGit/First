import java.util.Scanner;

public class exercice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int occurences = 0;
		String phrase;
		char caract�re;
		Scanner sc = new Scanner(System.in);
		Fonction f = new Fonction();
		
		System.out.println("Veuillez indiquer votre phrase :");
		phrase = sc.nextLine();
		
		phrase = f.pointfinal(phrase, sc);

		System.out.println("Veuillez indiquer votre caract�re :");
		caract�re = (sc.nextLine()).charAt(0);
		for (int compteur = 0; compteur<phrase.length(); compteur++)
			{
			if(phrase.charAt(compteur) == caract�re)
				{
				occurences++;
				}
			}
		System.out.println("Le caract�re choisi �tait : "+caract�re);
		System.out.println("Occurences du caract�re : " + occurences);
		}

	
	}



