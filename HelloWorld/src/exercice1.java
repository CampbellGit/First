import java.util.Scanner;

public class exercice1 {
	
	public static void main(String[] args) {
		
		int persmoins20 = 0, nbPers = 0;
		float age;
		Scanner sc = new Scanner(System.in);
		do
			{
			System.out.println("Veuillez indiquer votre �ge en chiffre :");
			age = sc.nextFloat();
			
			if (age < 20) 
				{
				persmoins20 = persmoins20+1;
				}
			
			nbPers = nbPers+1;
			System.out.println("R�sultats actuels");
			System.out.println("Nombre de personnes int�rrog�es : " +nbPers);
			System.out.println("Personnes de moins de 20 ans : " +persmoins20);
			}
		while (nbPers < 20);
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("20 personnes ont r�pondu � l'enqu�te, voici les r�sultats :");
		System.out.println("Nombre de personnes int�rrog�s : " +nbPers);
		System.out.println("Personnes de moins de 20 ans : " +persmoins20);
	}
}