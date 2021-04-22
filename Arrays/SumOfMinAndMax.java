import java.util.*;

public class Sum {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of an array:");
    int n = sc.nextInt();

    if (n <= 0) {
      System.out.println("Invalid Array Size");
      return;
    }

    System.out.println("Enter the elements:");
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sc.nextLine();
    }

    Arrays.sort(arr);

    System.out.println(arr[0]+arr[n-1]);
  }
}
