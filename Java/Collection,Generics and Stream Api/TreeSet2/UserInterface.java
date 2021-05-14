import java.util.*;

public class UserInterface {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter number of elements to add");
n = sc.nextInt();
sc.nextLine();
TreeSet<String> ts = new TreeSet<String>();
for (int i = 0; i < n; i++) {
ts.add(sc.nextLine());
}

Iterator i=ts.iterator();

while(i.hasNext()){
System.out.println(i.next());
}
}
}
