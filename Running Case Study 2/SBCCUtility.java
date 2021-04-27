package com.sbcc.utility;

import com.sbcc.model.Player;
import java.util.*;

public class SBCCUtility { // Include the logic of parsePlayerDetails method as specified in the requirement document - 2

  public Player parsePlayerDetails(String playerDetails) {
    Player p = new Player();
    String a[] = playerDetails.split(":");
    String playerId, playerName, playingZone, playerType;
    int matchesPlayed;
    p.setPlayerId(a[0]);
    p.setPlayerName(a[1]);
    p.setMatchesPlayed(Integer.parseInt(a[2]));
    matchesPlayed = Integer.parseInt(a[2]);
    int total = p.calculateTotalRuns(
      Arrays.copyOfRange(a, 3, 3 + matchesPlayed)
    );
    p.setRunScored(total);
    p.setPlayingZone(a[a.length - 4]);
    return p;
  }
}
