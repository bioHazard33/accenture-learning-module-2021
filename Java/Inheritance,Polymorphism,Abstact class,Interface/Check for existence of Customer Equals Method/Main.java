import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name:");
    String a = sc.nextLine();
    System.out.println("Enter the panno:");
    sc.next();
    String b = sc.nextLine();
    System.out.println("Enter the emailid");
    sc.next();
    String e = sc.nextLine();
    System.out.println("Enter the salary:");
    int c = sc.nextInt();
    System.out.println("Enter the name:");
    sc.nextLine();
    String d = sc.nextLine();
    System.out.println("Enter the panno:");
    sc.next();
    String f = sc.nextLine();
    System.out.println("Enter the emailid:");
    sc.next();
    String g = sc.nextLine();
    System.out.println("Enter the salary:");
    int h = sc.nextInt();
    Customer a1 = new Customer(a, b, e, c);
    Customer a2 = new Customer(d, f, g, h);
    boolean a3 = true;
    a3 = a1.equals(a2);
    if (a3 == true) System.out.println(
      "Both the objects are equal."
    ); else System.out.println("Both the objects are not equal.");
  }
}
