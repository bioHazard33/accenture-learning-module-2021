import java.util.Scanner;

public class NumberTypeUtility {

  public static NumberType isOdd() {
    NumberType obj = (int n) -> {
      if (n % 2 == 0) return false; else return true;
    };
    return obj;
  }

  public static void main(String[] args) {
    /* code */Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if (isOdd().checkNumberType(x)) {
      System.out.println(x + " is odd");
    } else {
      System.out.println(x + " is not odd");
    }
  }
}
