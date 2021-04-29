import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of passengers:");
    System.out.println("\n");
    int n = sc.nextInt();
    sc.nextLine();
    System.out.println("\n");
    String s[] = new String[n];
    for (int i = 1; i <= n; i++) {
      System.out.println("Passenger " + i);
      System.out.println("\n");
      System.out.println("Enter the ticketid:");
      int ticketid = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter the name:");
      String name = sc.nextLine();
      System.out.println("Enter the gender:");
      String gender = sc.nextLine();
      System.out.println("Enter the address:");
      String address = sc.nextLine();
      Passenger p = new Passenger(ticketid, name, gender, address);
      s[i - 1] = p.toString();
    }
    for (String x : s) System.out.println(x);
  }
}
