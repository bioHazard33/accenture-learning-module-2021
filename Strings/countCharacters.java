import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int length = sentence.length();
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
            count++;
         }
        
        System.out.println(count);

    }
}