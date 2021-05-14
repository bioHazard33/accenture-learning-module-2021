public class Movie{
    private String movieName,movieCategory;
    private int ticketCost;
    
    public void setMovieName(String s){
        movieName=s;
    }
    public void setMovieCategory(String s){
        movieCategory=s;
    }
    public void setTicketCost(int i){
        ticketCost=i;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    public int calculateTicketCost(String circle){
        String cat=getMovieCategory();
        if(circle.equalsIgnoreCase("GOLD")&& cat.equalsIgnoreCase("2d")){
            setTicketCost(300);
            //System.out.println("circle and cat=="+circle+cat);
            return 0;
        }
        else if(circle.equalsIgnoreCase("GOLD")&& cat.equalsIgnoreCase("3d"))
        {
            setTicketCost(500);
            return 0;
        }
        else if(circle.equalsIgnoreCase("SILVER")&&cat.equalsIgnoreCase("2d"))
        {
            setTicketCost(250);
            return 0;
       }
        else if(circle.equalsIgnoreCase("SILVER")&&cat.equalsIgnoreCase("3d"))
        {
            setTicketCost(450);
            return 0;
        }
        else if(circle.equalsIgnoreCase("GOLD")||circle.equalsIgnoreCase("SILVER"))
        {
            return -1;
        }
        else if(cat.equalsIgnoreCase("2d")||cat.equalsIgnoreCase("3d"))
        {
            return -2;
        }
        return -3;
    }
}