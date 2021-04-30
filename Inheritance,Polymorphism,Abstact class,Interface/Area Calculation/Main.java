import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the shape :");
    String str = sc.nextLine();
    double area = 0;
    if (str.equalsIgnoreCase("Circle")) {
      System.out.println("Enter the radius :");
      Shape s = new Circle(sc.nextFloat());
      area = s.calculateArea();
    } else if (str.equalsIgnoreCase("Rectangle")) {
      System.out.println("Enter the length :");
      float l = sc.nextFloat();
      System.out.println("Enter the breadth :");
      float b = sc.nextFloat();
      Shape s = new Rectangle(l, b);
      area = s.calculateArea();
    } else {
      System.out.println("Enter the base :");
      float x = sc.nextFloat();
      System.out.println("Enter the height :");
      float h = sc.nextFloat();
      Shape s = new Triangle(x, h);
      area = s.calculateArea();
    }
    String are = (String.format("%.2f", area));
    System.out.println("The area of " + str + " is : " + are);
  }
}
