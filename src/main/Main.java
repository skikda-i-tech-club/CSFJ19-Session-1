package main;

import forme.Carre;
import forme.Cercle;
import forme.Forme;
import forme.Rectangle;
import point.Point;

public class Main {

  public static void main(String[] args) {
//    testnbPoint();
//    testerType();
    testerHeritage();
  }

  public static void testerType() {
    Affichable aff = Point.createCartesien(0, 0);
    System.out.println(aff);
    afficherType(aff);
  }

  public static void afficherType(Affichable aff) {
    if (aff instanceof Point) {
      System.out.println("L'objet est de type Point");
    } else if (aff instanceof Cercle) {
      System.out.println("L'objet est de type Cercle");
    } else {
      System.out.println("L'objet est de type Object");
    }

//    System.out.println(aff.getClass());
  }

  public static void testnbPoint() {
    System.out.println(Point.getNbPoint());
    for (int i = 0; i < 20; i++) {
      Point p = Point.createCartesien(5, 40);
//      Point p = Point.createPolaire(5, (float) Math.PI);
    }
    System.out.println(Point.getNbPoint());
  }

  public static void testerHeritage() {
    Forme forme1 = new Cercle(10, 10, 20);
    Forme forme2 = new Rectangle(10, 20);
    Forme forme3 = new Carre(4);

    forme1.afficher();
    System.out.println("----");

    forme2.afficher();
    System.out.println("----");

    forme3.afficher();
  }

}
