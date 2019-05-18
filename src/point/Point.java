package point;

import main.Affichable;

public class Point implements Affichable {

  protected static int nbPoint = 0;

  public static int getNbPoint() {
    return nbPoint;
  }

  public static Point createCartesien(float x, float y) {
    Point p = new Point();
    p.setCartesienne(x, y);
    return p;
  }

  public static Point createPolaire(float l, float a) {
    Point p = new Point();
    p.setPolaire(l, a);
    return p;
  }

  protected float x;
  protected float y;

  private Point() {
    nbPoint++;
  }

  public float getX() {
    return this.x;
  }

  // x doit être entre -20 et 20.
  public void setX(float x) {
//    this.x = x;
    if (x >= -20 && x <= 20) {
      this.x = x;
    } else {
      // Programmation offensive.
      System.err.println("Erreur : " + x + " n'est pas valide.");
      System.exit(-1);
    }
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getLong() {
//    return (float) Math.sqrt(x * x + y * y);
//    return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    return (float) Math.hypot(x, y);
  }

  public void setLong(float l) {
    float a = getAngle();
    setPolaire(l, a);
  }

  public float getAngle() {
    return (float) Math.atan2(y, x);
  }

  public void setAngle(float a) {
    float l = getLong();
    setPolaire(l, a);
  }

  public void setPolaire(float l, float a) {
    // x = L * cos(a);
    // y = L * sin(a);
    setCartesienne(
            (float) (l * Math.cos(a)),
            (float) (l * Math.sin(a))
    );
  }

  public void setCartesienne(float x, float y) {
    setX(x);
    setY(y);
  }

  @Override
  public String toString() {
//    return "(" + x + ", " + y + ")";
    return String.format("(%+06.2f, %+06.2f)\n", x, y);
  }

  // Cette méthode test l'égalité entre deux objets (égalité entre attributs)
  @Override
  public boolean equals(Object obj) {
    // ce test vérifie l'identité (égalité entre références)
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Point other = (Point) obj;
    return this.x == other.x && this.y == other.y;
  }

  @Override
  public void afficher() {
    System.out.println(toString());
  }

}
