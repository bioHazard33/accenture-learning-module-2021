import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int length = sentence.length();
        
        int a=sc.nextInt();
        sc.nextLine();
        int b=sc.nextInt();
        sc.nextLine();

        System.out.println(sentence.substring(a,b));
    }
}