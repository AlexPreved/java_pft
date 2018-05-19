package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by pc05 on 20.05.2018.
 */
public class PointTests {
  @Test
  public void testPoint2211(){
    Point p1 = new Point(2.0, 2.0);
    Point p2 = new Point(1.0, 1.0);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);
  }
  @Test
  public void testPoint561020(){
    Point p1 = new Point(5.0, 6.0);
    Point p2 = new Point(10.0, 20.0);
    Assert.assertEquals(p1.distance(p2), 14.866068747318506);
  }
  @Test
  public void testPoint102034(){
    Point p1 = new Point(-10.0, -20.0);
    Point p2 = new Point(3.0, 4.0);
    Assert.assertEquals(p1.distance(p2), 27.294688127912362);
  }
  @Test
  public void testPoint1020340(){
    Point p1 = new Point(-10.0, -20.0);
    Point p2 = new Point(-3.0, -4.0);
    Assert.assertEquals(p1.distance(p2), 17.46424919657298);
  }
}
