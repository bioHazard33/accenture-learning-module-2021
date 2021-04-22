public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public void setTicketId(int a){
        ticketid=a;
    }
    
    public void setPrice(int a){
        price=a;
    }

    public static void setAvailableTickets(int a){
        if(a>0)    availableTickets=a;
    }

    public int getTicketId(){
        return ticketid;
    }
    
    public int getPrice(){
        return price;
    }

    public static int getAvailableTickets(){
        return availableTickets;
    }


    public static int calculateTicketCost(int nooftickets) {
        if(nooftickets<=availableTickets){
            availableTickets-=nooftickets;
            return nooftickets*price;
        }
        return -1;
    }
}