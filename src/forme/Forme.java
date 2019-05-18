package forme;

import main.Affichable;

public abstract class Forme implements Affichable {

  public abstract float getAire();

  public abstract float getPerimetre();

  @Override
  public void afficher() {
    System.out.println("Forme d'aire = " + getAire()
            + " et de perimetre = " + getPerimetre());
  }

}
