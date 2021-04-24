import java.util.*;

class Main{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String sentence = scn.nextLine();

        String c=scn.nextLine();

        String arr[]=sentence.split(c);

        for(int i=0;i<arr.length;i++)   System.out.println(arr[i]);
    }
}