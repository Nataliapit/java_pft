package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    String somebody = "world";
    System.out.println("Hello, " + somebody + "!");
    hello("world");
    hello("user");
    hello("Natalia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " равна " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    Point p1 = new Point(5, 8);
    Point p2 = new Point(2, 12);
    System.out.println("Расстояние между точками " + p1.x + "," + p1.y + " и " + p2.x + "," + p2.y + " равно " + distance(p1, p2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));

  }

}