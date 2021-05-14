package com.sbcc.utility;

import com.sbcc.model.Player;
import java.util.*;
import java.util.regex.*;

public class SBCCUtility {

  public Player parsePlayerDetails(String playerDetails) {
    Player p = new Player();
    String a[] = playerDetails.split(":");
    String playerId, playerName, playingZone, playerType;
    int matchesPlayed;
    p.setPlayerId(a[0]);
    if (validatePlayerId(p.getPlayerId())) {
      p.setPlayerName(a[1]);
      p.setMatchesPlayed(Integer.parseInt(a[2]));
      matchesPlayed = Integer.parseInt(a[2]);
      int total = p.calculateTotalRuns(
        Arrays.copyOfRange(a, 3, 3 + matchesPlayed)
      );
      p.setRunScored(total);
      p.setPlayingZone(a[a.length - 4]);
      return p;
    } else return null;
  }

  public boolean validatePlayerId(String playerId) {
    String s = playerId;
    String regex = "[A-Z]{4}[0-9]{4}[A-Z]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(s);
    if (m.matches() && s.length() == 9) return true; else return false;
  }
}
