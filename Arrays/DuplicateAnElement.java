import java.util.Scanner;

public class DuplicateElement {

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of an array:");
int n = sc.nextInt();

if(n<=0){
System.out.println("Invalid array size");
return;
}

System.out.println("Enter the array elements:");
int arr[] = new int[n+1];

for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
sc.nextLine();
}

System.out.println("Enter the position of the element to be replicated:");
int t=sc.nextInt();
sc.nextLine();

if(t>=n){
System.out.println("Position is greater than the size of an array");
return;
}

arr[n]=arr[t];

for (int i = 0; i <= n; i++) System.out.println(arr[i]);
}
}
