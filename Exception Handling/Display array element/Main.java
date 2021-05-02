import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      String arr[] = new String[5];
      for (int i = 0; i < 5; i++) {
        arr[i] = sc.nextLine();
      }
      int a = sc.nextInt();
      System.out.println(arr[a]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index is out of bounds of the array");
    } finally {
      System.out.println("Thank you Have a nice day");
    }
  }
}
