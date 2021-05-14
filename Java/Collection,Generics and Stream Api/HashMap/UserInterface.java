import java.util.*;

public class UserInterface {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements to add");
    int n = sc.nextInt();
    sc.nextLine();

    HashMap<Integer, String> hm = new HashMap<Integer, String>();

    for (int i = 0; i < n; i++) {
      int temp;
      String temp2;
      System.out.println("Enter the country code");
      temp = sc.nextInt();sc.nextLine();

      System.out.println("Enter the country name");
      temp2 = sc.nextLine();

      hm.put(temp, temp2);
    }

    System.out.println(hm);
  }
}
