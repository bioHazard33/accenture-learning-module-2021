import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //FILL THE CODE
    try {
      int a = sc.nextInt();
      System.out.println("The input is " + a);
    } catch (InputMismatchException e) {
      System.out.println("Input should be a number");
    }
  }
}
