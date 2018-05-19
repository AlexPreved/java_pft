package ru.stqa.pft.sandbox;

/**
 * Created by pc05 on 18.05.2018.
 */
public class Rectangle {
  double a;
  double b;

  public Rectangle(double a, double b){
    this.a = a;
    this.b = b;
  }

  public  double area (){
    return this.a * this.b;
  }
}
