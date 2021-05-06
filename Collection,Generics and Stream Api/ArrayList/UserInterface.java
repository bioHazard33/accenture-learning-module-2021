import java.util.*;

public class UserInterface {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<String>();
    System.out.println("Enter number of elements to add");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextLine());
    }
    if (n > 1) {
      for (int i = 0; i < n; i++) {
        if (i == 0) {
          System.out.print("[" + arr.get(i) + ", ");
        } else if (i == n - 1) System.out.print(arr.get(i) + "]"); else {
          System.out.print(arr.get(i) + ", ");
        }
      }
    }
    if (n == 1) System.out.print("[" + arr.get(0) + "]");
  }
}
