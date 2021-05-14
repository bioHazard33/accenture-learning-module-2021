import java.util.*;

class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String sentence2 = sc.nextLine();

        if(sentence.equals((sentence2))){
            System.out.println("Case sensitive");
        }
        else if(sentence.equalsIgnoreCase(sentence2)){
            System.out.println('Case insensitive');
        }
        else{
            System.out.println("Not equal");
        }

    }
}