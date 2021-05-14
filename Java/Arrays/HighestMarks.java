import java.util.Scanner;

public class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[6];
    int maxm = 0;
    for (int i = 0; i < 6; i++) {
      arr[i] = sc.nextInt();
      sc.nextLine();

      max = Math.max(max, arr[i]);

      if (arr[i] < 0) {
        System.out.println("Invalid Marks");
        return;
      }
    }

    System.out.println("Highest marks is " + max);
  }
}
