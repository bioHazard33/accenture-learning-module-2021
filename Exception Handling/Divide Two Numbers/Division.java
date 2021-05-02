import java.util.*;

public class Division {

    public String divideTwoNumbers(int number1,int number2){
        String s="";
        try{
            s=s+"The answer is "+(number1/number2)+". ";
        }
        catch(ArithmeticException e){
            s=s+"Division by zero is not possible. ";
        }
        finally{
            s+="Thanks for using the application.";
        }
        return s;
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers");
      int a = sc.nextInt();sc.nextLine();
      int b = sc.nextInt();sc.nextLine();
      Division d=new Division();

      System.out.println(d.divideTwoNumbers(a, b));

  }
}
