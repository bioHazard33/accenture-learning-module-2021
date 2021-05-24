import java.util.*;

public class MergeSortDriver {

  public static void merge(int arr[], int beg, int mid, int end) {
    int l = mid - beg + 1;
    int r = end - mid;
    int LeftArray[] = new int[l];
    int RightArray[] = new int[r];
    for (int i = 0; i < l; ++i) LeftArray[i] = arr[beg + i];
    for (int j = 0; j < r; ++j) RightArray[j] = arr[mid + 1 + j];
    int i = 0, j = 0;
    int k = beg;
    while (i < l && j < r) {
      if (LeftArray[i] <= RightArray[j]) {
        arr[k] = LeftArray[i];
        i++;
      } else {
        arr[k] = RightArray[j];
        j++;
      }
      k++;
    }
    while (i < l) {
      arr[k] = LeftArray[i];
      i++;
      k++;
    }
    while (j < r) {
      arr[k] = RightArray[j];
      j++;
      k++;
    }
  }

  public static void mergeSort(int arr[], int beg, int end) {
    if (beg < end) {
      int mid = (beg + end) / 2;
      mergeSort(arr, beg, mid);
      mergeSort(arr, mid + 1, end);
      merge(arr, beg, mid, end);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an array:");
    int n = sc.nextInt();
    if (n <= 0) {
      System.out.println("Invalid array size");
      System.exit(0);
    }
    sc.nextLine();
    System.out.println("\n");
    int arr[] = new int[n];
    System.out.print("Enter the elements:");
    for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
    sc.nextLine();
    System.out.println("Given array is\n");
    for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    MergeSortDriver ob = new MergeSortDriver();
    ob.mergeSort(arr, 0, arr.length - 1);
    System.out.println("\n\n");
    System.out.println("Sorted array is\n");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
