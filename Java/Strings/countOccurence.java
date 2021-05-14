import java.util.*;
import java.util.regex.*;

public class OccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine();

        Pattern pattern=Pattern.compile("^[a-zA-Z]*$");

        Matcher m=pattern.matcher(s);

        if(m.matches()==true){
            System.out.println("Enter the character:");
            char c=sc.next().charAt(0);
            
            m=pattern.matcher(c+"");
            if(m.matches()==true)
            {
                int ctr=0;
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==c)   ctr++;
                }
                if(ctr==0) System.out.println("The given character \'"+c+"\' not present in the given word.");
                else System.out.println("No of \'"+c+"\' present in the given word is "+ctr+".");
            }
            else{
                System.out.println("Given character is not an alphabet");
            }    
        }
        else{
            System.out.println("Not a valid string");
        }
        
    }
}
