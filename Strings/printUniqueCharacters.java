import java.util.*;
import java.util.regex.*;

public class printUniqueCharacters {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the sentence:");
String s=sc.nextLine();

Pattern pattern=Pattern.compile("^[a-zA-Z ]*$");
Matcher m=pattern.matcher(s);

if(m.matches()==true){
int ctr=0;
char t[]=new char[s.length()];

Map<Character,Integer> h=new LinkedHashMap<Character,Integer>();

for(int i=0;i<s.length();i++){
if(h.containsKey(s.charAt(i))){
h.put(s.charAt(i),h.get(s.charAt(i))+1);
}
else{
h.put(s.charAt(i),1);
}
}

for(Map.Entry me:h.entrySet()){
if((int)me.getValue()==1){
t[ctr]=(char)me.getKey();
ctr++;
}
}


if(ctr==0){
System.out.println("No unique characters");
}
else{
System.out.println("Unique characters:");

for(int i=0;i<ctr;i++)System.out.println(t[i]);
}
}
else{
System.out.println("Invalid Sentence");
}

}
}
