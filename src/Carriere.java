public class Carriere {

    String nomCarriereJoueur;
    int level;
    double porteFeuille;

    public Carriere(String nom){
        this.nomCarriereJoueur = nom;
        this.level = 0;
        this.porteFeuille = 1000;
    }



    public double getPorteFeuille() {
        return porteFeuille;
    }

    public int getLevel() {
        return level;
    }

    public String getNomCarriereJoueur() {
        return nomCarriereJoueur;
    }

    public void setLevel() { // Implementer bonus tapis level bonus
        this.level += 1;
    }

    public void setPorteFeuille(double porteFeuille) {
        this.porteFeuille += porteFeuille;
    }

}
