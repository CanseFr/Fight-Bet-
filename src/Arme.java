public class Arme implements Randomiser {
    String nom;
    int degat;

    Arme(String nom, int degat){
        this.nom = nom;
        this.degat = degat;
    }

    Arme(){}

    public int getDegat() {
        return degat;
    }

    public String getNom() {
        return nom;
    }


    @Override
    public int returnRand(int taille) {
        return (int) (Math.random() * (taille));
    }
}
