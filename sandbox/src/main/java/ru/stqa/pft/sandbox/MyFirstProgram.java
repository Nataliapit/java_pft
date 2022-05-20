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

    Point p1 = new Point(5, 8, 2, 12);
    System.out.println("Расстояние между точками " + p1.x1 + "," + p1.y1 + " и " + p1.x2 + "," + p1.y2 + " равно " + p1.distance());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}