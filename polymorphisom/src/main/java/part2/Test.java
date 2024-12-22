
package part2;

class Test {
  public static void main(String[] args) {
    Shape s = new Shape(0, 0);
    System.out.println("Shape Area: " + s.area());

    s = new Rectangle(10, 20);
    System.out.println("Rectangle Area: " + s.area());

    s = new Triangle(10, 20);
    System.out.println("Triangle Area: " + s.area());
  }
}

