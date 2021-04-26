import java.util.*;
import java.util.regex.*;

public class Main{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Generate your Security Code ");
String s = sc.nextLine();

Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[@*#])[A-Za-z0-9@#*]{8,}$");

Matcher m = pattern.matcher(s);

if (m.matches() == true) {
System.out.println("Security Code Generated Successfully");
} else {
System.out.println("Invalid Security Code, Try Again!");
}
}
}
