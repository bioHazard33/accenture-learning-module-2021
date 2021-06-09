package com.sbcc.main;

import com.sbcc.exception.*;
import com.sbcc.service.*;
import com.sbcc.skeletonvalidator.SkeletonValidator;
import java.util.*;

public class UserInterface {

  public static void main(String[] args) throws InvalidPlayerIdException {
    SkeletonValidator validator = new SkeletonValidator();
    Scanner sc = new Scanner(System.in);
    SBCCService sb = new SBCCService();
    while (true) {
      System.out.println("1.Validate player details");
      System.out.println("2.Create Batsman or Bowler");
      System.out.println("3.Validation with InvalidPlayerIdException");
      System.out.println("4.Add Player Details");
      System.out.println("5.Top three players");
      System.out.println("6.Exit");
      System.out.println("Enter your choice");
      int choice = sc.nextInt();
      sc.nextLine();
      if (choice == 1 || choice == 2 || choice == 3) {
        System.out.println("Enter the player details");
        String s = sc.nextLine();
        if (s.contains("Batsman")) {
          com.sbcc.model.Player obj = new com.sbcc.utility.SBCCUtility()
          .parsePlayerDetails(s);
          if (obj == null) {
            System.out.println("Please provide a valid record");
          } else {
            System.out.println("Player id: " + obj.getPlayerId());
            System.out.println("Player name: " + obj.getPlayerName());
            System.out.println(
              "No. of matches played: " + obj.getMatchesPlayed()
            );
            System.out.println("Total runs scored: " + obj.getRunScored());
            System.out.println("Playing zone: " + obj.getPlayingZone());
            if (choice == 2 || choice == 3) {
              com.sbcc.model.Batsman bobj = (com.sbcc.model.Batsman) obj;
              System.out.println(
                "Number of Hundreds: " + bobj.getNoOfHundreds()
              );
              System.out.println("Number of Fifties: " + bobj.getNoOfFifties());
              System.out.println("Star Rating: " + bobj.getStarRating());
            }
          }
        }
        if (s.contains("Bowler")) {
          com.sbcc.model.Player obj = new com.sbcc.utility.SBCCUtility()
          .parsePlayerDetails(s);
          if (obj == null) {
            System.out.println("Please provide a valid record");
            System.exit(0);
          } else {
            System.out.println("Player id: " + obj.getPlayerId());
            System.out.println("Player name: " + obj.getPlayerName());
            System.out.println(
              "No. of matches played: " + obj.getMatchesPlayed()
            );
            System.out.println("Total runs scored: " + obj.getRunScored());
            System.out.println("Playing zone: " + obj.getPlayingZone());
            if (choice == 2 || choice == 3) {
              com.sbcc.model.Bowler dobj = (com.sbcc.model.Bowler) obj;
              System.out.println("Number of Maidens: " + dobj.getNoOfMaiden());
              System.out.println(
                "Number of Hattricks: " + dobj.getNoOfHattrick()
              );
              System.out.println("Star Rating: " + dobj.getStarRating());
            }
          }
        }
      }
      if (choice == 4) {
        System.out.println("Enter the number of player details");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the player details");
        String player_details_entered[] = new String[num];
        for (int i = 0; i < num; i++) {
          player_details_entered[i] = sc.nextLine();
        }
        int valid_records = sb.addPlayerObject(player_details_entered);
        System.out.println(valid_records + " valid records found");
      }
      if (choice == 5) {
        System.out.println("Enter the player type");
        String player_type = sc.nextLine();
        Map<String, Double> top3 = sb.findTopPlayerDetails(player_type);
        for (Map.Entry m : top3.entrySet()) {
          System.out.println(m.getKey() + " " + m.getValue());
        }
      }
      if (choice == 6) {
        System.out.println("Thank you for using SBCC application");
        System.exit(0);
      }
    }
  }
}
