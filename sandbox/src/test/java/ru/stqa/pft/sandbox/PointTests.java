package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance() {
    Point p1 = new Point(5, 8);
    Point p2 = new Point(2, 12);

    Assert.assertEquals(p1.distance(p2),5.0);
    Assert.assertEquals(p1.distance(p2),115.0);
    Assert.assertEquals(p1.distance(p2),5);

    p1 = new Point(7, 10);
    p2 = new Point(12, 4);

    Assert.assertEquals(p1.distance(p2),5.0);
  }
}
