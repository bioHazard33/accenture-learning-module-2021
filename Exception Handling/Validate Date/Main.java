import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    try {
      Date d = convertStringToDate(s);
      System.out.println(s + " is a valid date");
    } catch (ParseException e) {
      System.out.println(s + " is not a valid date");
    }
  }

  public static Date convertStringToDate(String str) throws ParseException {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    formatter.setLenient(false);
    Date d = formatter.parse(str);
    return d;
  }
}
