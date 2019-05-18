package forme;

public class Carre extends Rectangle {

  public Carre(float longueur) {
    super(longueur, longueur);
  }

  public Carre() {
  }

  @Override
  public void setLargeur(float largeur) {
    this.longueur = largeur;
    this.largeur = largeur;
  }

  @Override
  public void setLongueur(float longueur) {
    this.longueur = longueur;
    this.largeur = longueur;
  }

  @Override
  public void afficher() {
    System.out.println("Carre de coté = " + longueur);
    super.afficher();
  }

}
