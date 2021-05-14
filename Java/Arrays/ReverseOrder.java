import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size:");
    int n = sc.nextInt();
    System.out.println("Enter the values");
    int arr[] = new int[n];
    for (int i = n-1; i >= 0; i--) {
      arr[i] = sc.nextInt();
      sc.nextLine();
    }
    for (int i = 0; i < n; i++) System.out.println(arr[i]);
  }
}
