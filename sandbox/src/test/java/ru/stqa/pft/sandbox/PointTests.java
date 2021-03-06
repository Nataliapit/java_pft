package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test
  public void testDistance() {
    Point p1 = new Point(5, 8);
    Point p2 = new Point(2, 12);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDistance2() {
    Point p1 = new Point(5, 8);
    Point p2 = new Point(2, 12);

    Assert.assertEquals(p1.distance(p2), 115.0);

  }

  @Test
  public void testDistance3() {
    Point p1 = new Point(5, 8);
    Point p2 = new Point(2, 12);

    Assert.assertEquals(p1.distance(p2), 5);

  }

  @Test
  public void testDistance4() {
    Point p1 = new Point(7, 10);
    Point p2 = new Point(12, 4);

    Assert.assertEquals(p1.distance(p2), 5.0);
  }

  @Test
  public void testDistance5() {
    Point p1 = new Point(7, 10);
    Point p2 = new Point(12, 4);

    Assert.assertEquals(p1.distance(p2), 7.81);
  }
}
