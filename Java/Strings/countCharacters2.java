import java.util.*;
import java.util.regex.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String s=sc.nextLine();

        Pattern pattern=Pattern.compile("^[a-zA-Z ]*$");

        Matcher m=pattern.matcher(s);

        if(m.matches()==true){
            int ctr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')   ctr++;
        }

        System.out.println(s+" has "+s.length()+" characters");
        }
        else{
            System.out.println("Invalid input");
        }
        
    }
}
