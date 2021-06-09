package com.sbcc.utility;

import com.sbcc.exception.*;
import com.sbcc.model.Batsman;
import com.sbcc.model.Bowler;
import com.sbcc.model.Player;
import java.util.*;
import java.util.regex.*;

public class SBCCUtility {

  public Player parsePlayerDetails(String playerDetails) {
    String a[] = playerDetails.split(":");
    String playerId, playerName, playingZone, playerType;
    int matchesPlayed;
    playerType = a[a.length - 3];
    try {
      validatePlayerId(a[0]);
    } catch (InvalidPlayerIdException e) {
      System.out.println(e.getMessage());
      return null;
    }
    if (playerType.equals("Batsman")) {
      Player bat = new Batsman(
        a[0],
        a[1],
        Integer.parseInt(a[2]),
        0,
        a[a.length - 4],
        Integer.parseInt(a[a.length - 2]),
        Integer.parseInt(a[a.length - 1])
      );
      bat.setRunScored(
        bat.calculateTotalRuns(
          Arrays.copyOfRange(a, 3, 3 + bat.getMatchesPlayed())
        )
      );
      bat.findStarRating();
      return bat;
    } else if (playerType.equals("Bowler")) {
      Player bowl = new Bowler(
        a[0],
        a[1],
        Integer.parseInt(a[2]),
        0,
        a[a.length - 4],
        Integer.parseInt(a[a.length - 2]),
        Integer.parseInt(a[a.length - 1])
      );
      bowl.setRunScored(
        bowl.calculateTotalRuns(
          Arrays.copyOfRange(a, 3, 3 + bowl.getMatchesPlayed())
        )
      );
      bowl.findStarRating();
      return bowl;
    } else return null;
  }

  public boolean validatePlayerId(String playerId)
    throws InvalidPlayerIdException {
    String s = playerId;
    String regex = "[A-Z]{4}[0-9]{4}[A-Z]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    if (m.matches()) return true; else {
      throw new InvalidPlayerIdException(
        "Player with Id " + s + " is not valid"
      );
    }
  }
}
