import java.util.*;
import java.util.regex.*;

public class UserMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your ID");
    String s = sc.nextLine();

    Pattern pattern = Pattern.compile("^GBL/[0-9]{3}/[0-9]{4}$");

    Matcher m = pattern.matcher(s);

    if (m.matches() == true) {
      System.out.println("Login Success");
    } else {
      System.out.println("Incorrect ID");
    }
  }
}
