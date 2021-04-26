import java.util.*;
import java.util.regex.*;

public class PanCard {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your PAN number");
String s=sc.nextLine();

Pattern pattern=Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]$");

Matcher m=pattern.matcher(s);

if(m.matches()==true){
System.out.println("Valid PAN number");
}
else{
System.out.println("Invalid PAN number");
}
}
}
