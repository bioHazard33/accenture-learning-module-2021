import java.util.*;

public class ArrayAccumulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1=sc.nextInt();sc.nextLine();

        if(n1<=0){
            System.out.println("Invalid array size");
            return;
        }

        int arr[]=new int[n1];
        System.out.println("Enter elements for first array:");
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Enter the size of second array:");
        int n2=sc.nextInt();sc.nextLine();

        if(n2<=0){
            System.out.println("Invalid array size");
            return;
        }

        int arr2[]=new int[n2];
        System.out.println("Enter elements for second array:");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
            sc.nextLine();
        }

        if(n1<=n2){
            for(int i=0;i<n1;i++)  System.out.println(arr[i]+arr2[i]);
            for(int i=n1;i<n2;i++) System.out.println(arr2[i]);
        }
        else{
            for(int i=0;i<n2;i++)  System.out.println(arr[i]+arr2[i]);
            for(int i=n2;i<n1;i++) System.out.println(arr[i]);
        }
    }    
}
