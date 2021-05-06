import java.util.*;

public class UserInterface {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements to add");
    int n = sc.nextInt();
    sc.nextLine();
    ArrayList<String> arr = new ArrayList<String>();
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextLine());
    }
    for (int i = 0; i < n; i++) System.out.println(arr.get(i));
  }
}
