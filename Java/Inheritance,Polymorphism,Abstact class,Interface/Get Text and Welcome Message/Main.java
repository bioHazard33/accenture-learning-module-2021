public class Main {
    public static DisplayText welcomeMessage(){
        DisplayText d=(String str)->System.out.println("Welcome "+str);
        return d;
    }
    public static void main(String[] args) {
        DisplayText d=welcomeMessage();
        String x=d.getIntput();
        g.displayText(x);
    }
}
