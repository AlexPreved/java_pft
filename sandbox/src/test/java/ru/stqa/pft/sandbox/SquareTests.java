package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by pc05 on 20.05.2018.
 */
public class SquareTests {

  @Test
  public void testArea(){
      Square kvad = new Square(5);
    Assert.assertEquals(kvad.area(), 25.0);

  }
}
