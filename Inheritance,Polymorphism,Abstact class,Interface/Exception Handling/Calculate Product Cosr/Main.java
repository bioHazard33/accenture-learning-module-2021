import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("Enter the total cost of photo frames");
      int a = sc.nextInt();
      System.out.println("Enter the number of photo frames");
      int b = sc.nextInt();
      int res = a / b;
      System.out.println("Cost of each photo frame is " + res);
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException : Cannot divide by zero");
    } catch (InputMismatchException e) {
      System.out.println("InputMismatchException : Input should be an integer");
    }
  }
}
