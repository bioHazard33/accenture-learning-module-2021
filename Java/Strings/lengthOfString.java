import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();
        int length = sentence.length();
        
        if(length%2==0){
            System.out.println(length + " Even");
        }
        else{
            System.out.println(length + " Odd");
        }
    }
}