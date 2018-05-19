package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(-10.0, -20.0);
    Point p2 = new Point(-3.0, -4.0);
    System.out.println(p1.distance(p2));


    Square kvad = new Square(4);
    System.out.println(kvad.area());

    Rectangle myRec = new Rectangle(6, 6);
    System.out.println(myRec.area());

  }





}