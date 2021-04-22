import java.util.Scanner;

public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Ticket t=new Ticket();
        
        System.out.println("Enter no of bookings:");
        int no_bookings=sc.nextInt();
        
        System.out.println("Enter the available tickets:");
        t.setAvailableTickets(sc.nextInt());
        
        while(no_bookings>0)
        {
            System.out.println("Enter the ticketid:");
            t.setTicketId(sc.nextInt());
            
            System.out.println("Enter the price:");
            t.setPrice(sc.nextInt());
            
            System.out.println("Enter the no of tickets:");
            int no_tickets=sc.nextInt();
            
            if(t.calculateTicketCost(no_tickets)==-1)
            {
                System.out.println("Tickets not sufficient / available");
                continue;
            }
            
            System.out.println("Available tickets: "+t.getAvailableTickets());
            
            System.out.println("Total amount:"+t.calculateTicketCost(no_tickets));
            
            System.out.println("Available ticket after booking:"+t.getAvailableTickets());
            
                no_bookings--;
            }
    }
}