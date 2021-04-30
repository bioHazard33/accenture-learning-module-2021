import java.util.*;
import java.util.regex.*;


public class ValidateUtility {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String ename,pname;
    ename=sc.nextLine(); 
    pname=sc.nextLine(); 
    Validate val=validateEmployeeName(); 
    if(val.validateName(ename)) 
    System.out.println("Employee name is valid"); 
    else System.out.println("Employee name is invalid"); 
    val=validateProductName(); 
    if(val.validateName(pname)) 
    System.out.println("Product name is valid"); 
    else System.out.println("Product name is invalid");
  } //fill code here

  public static Validate validateEmployeeName() { //fill code here
    Validate obj=(String s) ->{
        Pattern p=Pattern.compile("^[A-Z a-z]{5,20}$");
        Matcher m=p.matcher(s);

        if(m.matches())    return true;
        return false;
    };
    return obj;
  }

  public static Validate validateProductName() {
    Validate obj=(String s) ->{
        Pattern p=Pattern.compile("^[A-Za-z][0-9]{5}$");
        Matcher m=p.matcher(s);

        if(m.matches())    return true;
        return false;
    };
    return obj;
  } //fill code here
}
