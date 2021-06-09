package com.sbcc.dao;

import com.sbcc.model.*;
import com.sbcc.utility.*;
import java.util.*;
import java.util.stream.*;

/*The class and methods should be declared as publicand all the attributes should be declared as private.*/public class SBCCBoard {

  private List<Player> playerList = new ArrayList<Player>();

  public List<Player> getPlayerList() {
    return this.playerList;
  }

  public void setPlayerList(List<Player> playerList) {
    this.playerList = playerList;
  }

  public int addPlayerObject(String[] pDetails) {
    SBCCUtility sb = new SBCCUtility();
    for (String m : pDetails) {
      Player p = sb.parsePlayerDetails(m);
      if (p != null) {
        this.playerList.add(p);
      }
    }
    return this.playerList.size();
  }

  public Map<String, Double> findTopPlayerDetails(String playerType) {
    List<Batsman> list_of_batsman = new ArrayList<Batsman>();
    List<Bowler> list_of_bowler = new ArrayList<Bowler>();
    if (playerType.equals("Batsman")) {
      for (Player p : this.playerList) {
        if (p instanceof Batsman) list_of_batsman.add((Batsman) p);
      }
    }
    if (playerType.equals("Bowler")) {
      for (Player x : this.playerList) {
        if (x instanceof Bowler) {
          list_of_bowler.add((Bowler) x);
        }
      }
    }
    List<Batsman> updated_list_batsman = list_of_batsman
      .stream()
      .sorted(Comparator.comparingDouble(Batsman::getStarRating))
      .collect(Collectors.toList());
    List<Bowler> updated_list_bowler = list_of_bowler
      .stream()
      .sorted(Comparator.comparingDouble(Bowler::getStarRating))
      .collect(Collectors.toList());
    Map<String, Double> top3 = new HashMap<String, Double>();
    if (playerType.equals("Batsman")) {
      for (
        int i = updated_list_batsman.size() - 1;
        i >= updated_list_batsman.size() - 3;
        i--
      ) {
        top3.put(
          updated_list_batsman.get(i).getPlayerId(),
          updated_list_batsman.get(i).getStarRating()
        );
      }
    }
    if (playerType.equals("Bowler")) {
      for (
        int i = updated_list_bowler.size() - 1;
        i >= updated_list_bowler.size() - 3;
        i--
      ) {
        top3.put(
          updated_list_bowler.get(i).getPlayerId(),
          updated_list_bowler.get(i).getStarRating()
        );
      }
    }
    return top3;
  }
}
