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
    System.out.println("Enter the number to find");
    int x=sc.nextInt();
    sc.nextLine();

    boolean flag=true;

    for (int i = 0; i < n; i++){
        if(arr[i]==x){
            System.out.println(i+1);
            flag=false;
            break;
        }
    }

    if(flag)    System.out.println(0);
  }
}
