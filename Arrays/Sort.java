import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n = sc.nextInt();
    System.out.println("Enter the values");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      sc.nextLine();
    }
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) System.out.println(arr[i]);
  }
}
