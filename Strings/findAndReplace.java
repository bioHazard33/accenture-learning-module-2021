import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findAndReplace {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Pattern p=Pattern.compile("^[A-Za-z .]*$");

        Matcher m=p.matcher(s);

        if(m.matches()==true){
            System.out.println("Enter the word to be searched:");
            String a=sc.nextLine(); 
            System.out.println("Enter the word to be replaced:");
            String b=sc.nextLine();

            String t;
            t=s.replaceAll(a, b);

            if(t.equals(s)){
                System.out.println("The word +"+a+" not found");
            }
            else System.out.println(s);
        }
        else{

        }

    }
}
