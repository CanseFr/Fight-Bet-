import java.util.Scanner;

public class Visuel {

    public void homePage(){
        System.out.println("" +
                "███╗   ███╗ █████╗ ██████╗  █████╗ ██╗   ██╗███████╗    ██████╗  █████╗ ██████╗ ████████╗██╗   ██╗\n" +
                "████╗ ████║██╔══██╗██╔══██╗██╔══██╗██║   ██║██╔════╝    ██╔══██╗██╔══██╗██╔══██╗╚══██╔══╝╚██╗ ██╔╝\n" +
                "██╔████╔██║███████║██████╔╝███████║██║   ██║█████╗      ██████╔╝███████║██████╔╝   ██║    ╚████╔╝ \n" +
                "██║╚██╔╝██║██╔══██║██╔══██╗██╔══██║╚██╗ ██╔╝██╔══╝      ██╔═══╝ ██╔══██║██╔══██╗   ██║     ╚██╔╝  \n" +
                "██║ ╚═╝ ██║██║  ██║██║  ██║██║  ██║ ╚████╔╝ ███████╗    ██║     ██║  ██║██║  ██║   ██║      ██║   \n" +
                "╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝    ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝      ╚═╝   \n" +
                "");
    }

    public static void lancementPresentation(Carriere j1) throws InterruptedException {
        // Lancement et presentation profil
        System.out.flush();
        System.out.println("Bonjour "+ j1.getNomCarriereJoueur() + " vous etes niveau " + j1.getLevel() + " et votre porte-feuille s'eleve à : " + j1.getPorteFeuille() + " $");
        Thread.sleep(1000);
        System.out.println("Etes vous pret a rentrer dans le cercle ? ");
        Thread.sleep(3000);
        System.out.flush();
    }

    public static void presentationFighter(Combatant p1, Combatant p2){
        System.out.println("Aujourd'hui les combattants sont :");
        System.out.println("        - "+p1.index+". "+p1.getNom());
        System.out.println("        - "+p2.index+". "+p2.getNom());
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void blablaFight() throws InterruptedException {
        System.out.println("Les champions ce prepare ...");
        Thread.sleep(1000);
        System.out.println("C'est parti ... Ding Ding Ding");
        Thread.sleep(2000);
        System.out.flush();
    }

}
