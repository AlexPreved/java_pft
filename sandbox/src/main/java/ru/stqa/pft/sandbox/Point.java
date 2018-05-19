package ru.stqa.pft.sandbox;

/**
 * Created by pc05 on 19.05.2018.
 */
public class Point {
  double x;
  double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public double distance (Point second){
    return Math.sqrt( (second.x - this.x)*(second.x - this.x)  +  (second.y - this.y)*(second.y - this.y) );
  }
}
