import java.util.Random;
public class Joueur
{
    String pseudo;
    int pointsBouclier=50;
    int degatsAInfliger;

    Joueur(String pseudo)
    {
        this.pseudo=pseudo;
    }

    void attaque(String joueur, String arme)
    {
        Random coupCritique = new Random();
        float probabilite = coupCritique.nextFloat();
        switch(arme)
        {
            case "hache":
                if(probabilite<=0.20f)
                {
                    degatsAInfliger=15;
                    System.out.println("Oh !! Coup critique");
                }
                else
                {
                    degatsAInfliger=10;
                }
                break;
            case "épée":
                if(probabilite<=0.20f)
                {
                    degatsAInfliger=20;
                    System.out.println("Oh !! Coup critique");
                }
                else
                {
                    degatsAInfliger=15;
                }
                break;
            case "pelle":
                if(probabilite<=0.20f)
                {
                    degatsAInfliger=25;
                    System.out.println("Oh !! Coup critique");
                }
                else
                {
                    degatsAInfliger=20;
                }
                break;
            default:
                System.out.println("Cette arme n'est pas disponible");
                System.out.println("Tu as perdu ton tour");
        }
        System.out.println(joueur+" est attaqué avec une "+arme+" et perd "+degatsAInfliger+"PV");
        pointsBouclier-=degatsAInfliger;
    }
}