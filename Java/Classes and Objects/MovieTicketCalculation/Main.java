import java.util.Scanner;
 public class Main{
     public static Movie getMovieDetails(){
         Movie mov=new Movie();
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the movie name:");
         mov.setMovieName(s.nextLine());
         System.out.println("Enter the movie category:");
         mov.setMovieCategory(s.nextLine());
         return mov;
     }
     public static String getCircle(){
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the circle:");
         return(s.nextLine());
     }
     public static void main (String[] args) {
         Scanner s=new Scanner(System.in);
         Movie m=getMovieDetails();
         String circle=getCircle();
         int type=m.calculateTicketCost(circle);
         System.out.println("Movie name = "+m.getMovieName());
         System.out.println("Movie category = "+m.getMovieCategory());
         if(type==0)
         System.out.println("The ticket cost is = "+m.getTicketCost());
         if(type==-1)
         System.out.println("Sorry there is no "+m.getMovieCategory()+" type of category in theater.");
         if(type==-2)
         System.out.println("Sorry!!! Circle is Invalid.");
         if(type==-3)
         System.out.println("Sorry!!! Both circle and category are Invalid.");
     }
 }