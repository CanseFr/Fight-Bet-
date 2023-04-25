import java.util.ArrayList;

public class Combatant {

    String nom;
    int vie = 100;
    int index;
//    Arme[] armement;

    Combatant(){}

    public Combatant(String nom, int index){
        this.nom = nom;
        this.index = index;
//        this.armement=armement;
    }

    public String getNom() {
        return nom;
    }

    public int getVie() {
        return vie;
    }

    public void setVieMoin(int vie) {
        this.vie -= vie;
    }

    public void setViePlus(int vie) {
        this.vie += vie;
    }

    public int getIndex() {
        return index;
    }

    public void lancerLeCombat(Combatant C1, Combatant C2, ArrayList<Arme> a1) throws InterruptedException {
        //_____________________________________________________________________________________
        // Boucle Combat
        while (C1.getVie() > 0 && C2.getVie() > 0){ // Break vie a partir de 0 !!
            // Creation random
            Arme rndmNP1 = new Arme();
            Arme rndmNP2 = new Arme();

            // Fight Player 1
            int rndAtckJ1 =  rndmNP1.returnRand(a1.size());
            System.out.println(C1.getNom() + " inflige " + a1.get(rndAtckJ1).getDegat() + " points de degats avec " + a1.get(rndAtckJ1).getNom() + " à : " +C2.getNom() );
            C2.setVieMoin(a1.get(rndAtckJ1).getDegat());
            System.out.println("Vie de " + C2.getNom() + " : " + C2.getVie());
                Thread.sleep(1000);
            System.out.println("---------VS--------");

            // Fight Player 2
            int rndAtckJ2 =  rndmNP2.returnRand(a1.size());
            System.out.println(C2.getNom() + " inflige " + a1.get(rndAtckJ2).getDegat() + " points de degats avec " + a1.get(rndAtckJ2).getNom() + " à : " +C1.getNom() );
            C1.setVieMoin(a1.get(rndAtckJ2).getDegat());
            System.out.println("Vie de " + C1.getNom() + " : " + C1.getVie());
                Thread.sleep(1000);
            System.out.println("*****************");
        }
    }


}
