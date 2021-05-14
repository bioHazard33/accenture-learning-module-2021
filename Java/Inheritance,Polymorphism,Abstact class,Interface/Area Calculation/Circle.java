public class Circle extends Shape {

  private float radius;

  public Circle(float radius) {
    this.radius = radius;
  }

  public double calculateArea() {
    return (double) (Math.PI * radius * radius);
  }
}
