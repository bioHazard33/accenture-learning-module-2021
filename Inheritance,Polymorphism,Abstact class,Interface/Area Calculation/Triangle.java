public class Triangle extends Shape {

  private float base, height;

  public Triangle(float base, float height) {
    this.base = base;
    this.height = height;
  }

  public double calculateArea() {
    return (double) (0.5 * base * height);
  }
}
