import java.util.Scanner;

@FunctionalInterface
public interface DisplayText {
    public void displayText(String text);

    public default String getIntput(){
        Scanner sc=new Scanner(System.in);
        return sc.nextLine();
    }
}
