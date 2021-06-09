import java.util.*;

@SuppressWarnings("unchecked")
public class UniqueWords {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student's Article");
    String s = sc.nextLine();
    s = s.toLowerCase();
    String[] words = s.split("[\\s ,;:.?!]+");
    System.out.println("Number of words " + words.length);
    TreeMap<String, Integer> hm = new TreeMap<String, Integer>();
    for (int i = 0; i < words.length; i++) {
      hm.put(words[i], i);
    }
    int count = 1;
    System.out.println("Number of unique words " + hm.size());
    System.out.println("The words are");
    for (Map.Entry m : hm.entrySet()) System.out.println(
      (count++) + ". " + m.getKey()
    );
  }
}
