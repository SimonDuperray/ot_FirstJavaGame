import java.util.Scanner;
public class Main {
    public static void main(String... args)
    {
        Joueur premierJoueur = new Joueur("Kartodix");
        System.out.println(premierJoueur.pseudo+" a rejoint la partie. PtsBouclier: "+premierJoueur.pointsBouclier);

        Joueur deuxiemeJoueur = new Joueur("Tehistir");
        System.out.println(deuxiemeJoueur.pseudo+" a rejoint la partie. PtsBouclier: "+deuxiemeJoueur.pointsBouclier);

        System.out.println("==========================================================");

        while(premierJoueur.pointsBouclier>0 | deuxiemeJoueur.pointsBouclier>0)
        {
            // instance du Scanner
            Scanner sc = new Scanner(System.in);

            // choix arme premier joueur
            System.out.println("Choisis une arme [hache - épée - pelle]: ");
            String premierJoueurArme = sc.next();
            premierJoueur.attaque(deuxiemeJoueur.pseudo, premierJoueurArme);

            // choix arme deuxième joueur
            System.out.println("Choisis une arme [hache - épée - pelle]: ");
            String deuxiemeJoueurArme = sc.next();
            deuxiemeJoueur.attaque(premierJoueur.pseudo, deuxiemeJoueurArme);

            // end
            System.out.println("===================================");
            System.out.println(premierJoueur.pseudo+" "+premierJoueur.pointsBouclier+" PV.");
            System.out.println(deuxiemeJoueur.pseudo+" "+deuxiemeJoueur.pointsBouclier+" PV.");
            System.out.println("===================================");

            if(premierJoueur.pointsBouclier<=0)
            {
                premierJoueur.pointsBouclier=0;
                System.out.println(deuxiemeJoueur.pseudo+" a gagné!");
                break;
            }
            else if(deuxiemeJoueur.pointsBouclier<=0)
            {
                deuxiemeJoueur.pointsBouclier=0;
                System.out.println(premierJoueur.pseudo+" a gagné!");
                break;
            }
        }
        System.out.println("PARTIE TERMINEE");
    }
}