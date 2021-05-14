public class Rectangle extends Shape {

  private float length, breadth;

  public Rectangle(float length, float breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public double calculateArea() {
    return (double) (length * breadth);
  }
}
