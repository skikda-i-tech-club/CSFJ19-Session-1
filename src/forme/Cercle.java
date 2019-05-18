package forme;

import point.Point;

public class Cercle extends Forme {

  protected Point centre;
  protected float r;

  public Cercle(float x, float y, float r) {
    this(Point.createCartesien(x, y), r);
    //...
  }

  public Cercle(Point centre, float r) {
    this.centre = centre;
    this.r = r;
  }

  @Override
  public void afficher() {
    System.out.println("Cercle de centre = " + centre + " et de rayon = " + r);
    super.afficher();
  }

  @Override
  public String toString() {
    return centre + " r = " + r;
  }

  @Override
  public float getAire() {
    return (float) (Math.PI * r * r);
  }

  @Override
  public float getPerimetre() {
    return (float) (2 * Math.PI * r);
  }

}
