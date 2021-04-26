import java.util.*;
import java.util.regex.*;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Pattern pattern=Pattern.compile("^[a-zA-Z ]*$");

        Matcher m=pattern.matcher(s);

        if(m.matches()==true){
            int ctr=0;
        System.out.println("No of characters is:"+s.length());
        }
        else{
            System.out.println("Invalid input");
        }
        
    }
}
