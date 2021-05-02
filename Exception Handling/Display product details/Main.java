import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter product name");
    String s = sc.nextLine();
    System.out.println("Enter price");
    int a = sc.nextInt();
    if (a >= 100) {
      System.out.println("Name : " + s);
      System.out.println("Price : " + a);
    } else {
      try {
        throw new InvalidPriceException(
          "InvalidPriceException - Product price invalid"
        );
      } catch (InvalidPriceException e) {}
    }
  }
}
