import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {

        Scanner sc = new Scanner(System.in);

        // Home page
        Visuel home = new Visuel();
        home.homePage();
        System.out.println("Rentrez votre nom de carriere : ");
        String nomCarrierePlayer = sc.nextLine();

        // Creer carriere joueur
        Carriere carriereJ1 = new Carriere(nomCarrierePlayer);

        // Lancement et presentation profil
        Visuel.lancementPresentation(carriereJ1);

        while (carriereJ1.porteFeuille > 0){
            // GGAAMMEE LLOOOOPP

            // Generation des combattant pour affichage paris
            // ? Penser a creer une bibliotheqe aleatoir de combattant ?
            // Creation Player 1
            Combatant P1 = new Combatant("Julien",1);
            System.out.println(P1.index);
            //Creation Player 2
            Combatant P2 = new Combatant("Margaux",2);
            System.out.println(P2.index);

            // Presentation des combattant et pari
            Visuel.presentationFighter(P1, P2);
            System.out.println("Sur quel poulain parier vous ? (1/2)");
            int choixCbt = sc.nextInt();

            // Parier sur poulain
            System.out.println("Combien souhaitez vous mettre en jeu ? ");
            double valeurParier = sc.nextDouble();

            while (valeurParier > carriereJ1.getPorteFeuille() ){
                System.out.println("Veuillez saisir une valeur correct ! ");
                System.out.println("Combien souhaitez vous mettre en jeu ? ");
                valeurParier = sc.nextDouble();
            }

            // Lancement Fight blabla
            Visuel.blablaFight();

            //_____________________________________________________________________________________
            // Creation des armes
            Arme arme1= new Arme("coup Couteau",4);
            Arme arme2= new Arme("coup de Machette",6);
            Arme arme3= new Arme("une bonne Patate",2);
            Arme arme4= new Arme(" un coupt de tete",3);
            Arme arme5= new Arme("un disque dur lancé au visage",1);
            Arme arme6= new Arme("un coup de point raté",1);
            Arme arme7= new Arme("une seringue ramassé par terre",10);
            Arme arme8= new Arme("un étranglement",4);
            Arme arme9= new Arme("un coup de genoux raté",2);
            Arme arme10= new Arme("une tentative de gifle",1);
            Arme arme11= new Arme("coup de point americain",5);
            Arme arme12= new Arme("un baton trouvé par terre",3);

            // Creation de liste des armes et integration
            ArrayList<Arme> listeArmes = new ArrayList<>();
            listeArmes.add(arme1);
            listeArmes.add(arme2);
            listeArmes.add(arme3);
            listeArmes.add(arme4);
            listeArmes.add(arme5);
            listeArmes.add(arme6);
            listeArmes.add(arme7);
            listeArmes.add(arme8);
            listeArmes.add(arme9);
            listeArmes.add(arme10);
            listeArmes.add(arme11);
            listeArmes.add(arme12);

            ////_____________________________________________________________________________________
            // Boucle Combat
            Combatant makeFight = new Combatant();
            makeFight.lancerLeCombat(P1, P2, listeArmes);

            // Departage victoir
            int indexVictoir = 0;
            if (P1.getVie() <= 0 ){
                System.out.println("Victoir de " + P2.getNom());
                indexVictoir = P2.getIndex();

            } else if (P2.getVie() <= 0){
                System.out.println("Victoir de " + P1.getNom());
                indexVictoir = P1.getIndex();

            } else if (P1.getVie() == P2.getVie()) {
                System.out.println("Match null");
                indexVictoir = 666;
            }

            // Victoir ou parte carriere agent niveau
            if (indexVictoir != choixCbt){
                System.out.println("Vous avez perdu votre mise");
                // Argent
                carriereJ1.setPorteFeuille(-valeurParier); // -
                System.out.println("Porte-feuille : "+ carriereJ1.getPorteFeuille());
                // Level
                System.out.println("Level : "+carriereJ1.getLevel());

                // Si match null, argent 0
                if (carriereJ1.getPorteFeuille() == 0 && P1.getVie() == P2.getVie()){
                    System.out.println("Vous avez de la chance ! ");
                }
                // Si plus argent et parie perdu
                else if (carriereJ1.getPorteFeuille() == 0 && indexVictoir != choixCbt){
                    System.out.println("C'est terminé pour vous !");
                    System.exit(0);
                }

            } else if (indexVictoir == choixCbt){
                System.out.println("Bravo vous remportez la mise ainsi qu'un niveau");
                carriereJ1.setPorteFeuille(valeurParier*0.75); // 0.5
                System.out.println("Porte-feuille : "+ carriereJ1.getPorteFeuille());
                // Level
                carriereJ1.setLevel();
                System.out.println("Level : "+carriereJ1.getLevel());

            } else if (indexVictoir == 666){

                System.out.println("Vous regagnez votre somme parié");
                System.out.println("Porte-feuille : "+ carriereJ1.getPorteFeuille());
                // Level
                System.out.println("Level : "+carriereJ1.getLevel());
            }
        }




    }
}