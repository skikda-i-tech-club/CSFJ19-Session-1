package forme;

public class Rectangle extends Forme {

  protected float longueur;
  protected float largeur;

  public Rectangle(float longueur, float largeur) {
    this.longueur = longueur;
    this.largeur = largeur;
  }

  public Rectangle() {
  }

  @Override
  public float getAire() {
    return longueur * largeur;
  }

  @Override
  public float getPerimetre() {
    return (longueur + largeur) * 2;
  }

  public float getLongueur() {
    return longueur;
  }

  public void setLongueur(float longueur) {
    this.longueur = longueur;
  }

  public float getLargeur() {
    return largeur;
  }

  public void setLargeur(float largeur) {
    this.largeur = largeur;
  }

  @Override
  public void afficher() {
    System.out.println("Rectangle de longueur = " + longueur
            + " et de largeur = " + largeur);
    super.afficher();
  }

}
