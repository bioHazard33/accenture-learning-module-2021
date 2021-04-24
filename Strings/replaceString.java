import java.util.*;

class FirstOccurence{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string:");
        String sentence = scn.nextLine();

        System.out.println("Enter the character to be searched:");
        char c=scn.next().charAt(0);
    
        System.out.println("Enter the character to replace:");
        char r=scn.next().charAt(0);

        String arr=sentence.replaceFirst(c+"",r+"");

        if(!arr.equals(sentence)){
            System.out.println(arr);
        }
        else{
            System.out.println("character not found");
        }
    }
}