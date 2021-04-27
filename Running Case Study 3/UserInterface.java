Scanner sc = new Scanner(System.in);
com.sbcc.model.Player obj=new com.sbcc.model.Player();
while(true){ 
    System.out.println("1.Validate player details"); 
    System.out.println("2.Exit"); 
    System.out.println("Enter your choice"); 
    int choice=sc.nextInt(); sc.nextLine(); 
    if(choice==1) { 
        System.out.println("Enter the player details"); 
        String s=sc.nextLine(); 
        obj=new com.sbcc.utility.SBCCUtility().parsePlayerDetails(s); 
        if(obj==null){ 
            System.out.println("Please provide a valid record"); 
            System.exit(0); 
        } else{ 
            System.out.println("Player id:"+obj.getPlayerId()); 
            System.out.println("Player name:"+obj.getPlayerName()); 
            System.out.println("Matches played:"+obj.getMatchesPlayed()); 
            System.out.println("Total runs scored:"+obj.getRunScored()); 
            System.out.println("Playing zone:"+obj.getPlayingZone()); 
        } 
    } 
    if(choice==2) { 
        System.out.println("Thank you for using SBCC application"); 
        System.exit(0); 
    }
}