package com.sbcc.model;

/*The class and methods should be declared as publicand all the attributes should be declared as private.*/public abstract class Player {

  private String playerId, playingZone;
  private String playerName;
  private int matchesPlayed;
  private int runScored;

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public String getPlayerId() {
    return this.playerId;
  }

  public void setPlayingZone(String playingZone) {
    this.playingZone = playingZone;
  }

  public String getPlayingZone() {
    return this.playingZone;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public String getPlayerName() {
    return this.playerName;
  }

  public void setMatchesPlayed(int matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }

  public int getMatchesPlayed() {
    return this.matchesPlayed;
  }

  public void setRunScored(int runScored) {
    this.runScored = runScored;
  }

  public int getRunScored() {
    return this.runScored;
  }

  public Player(
    String playerId,
    String playerName,
    int matchesPlayed,
    int runScored,
    String playingZone
  ) {
    setPlayerId(playerId);
    setPlayerName(playerName);
    setMatchesPlayed(matchesPlayed);
    setRunScored(runScored);
    setPlayingZone(playingZone);
  }

  public Player() {}

  public int calculateTotalRuns(String[] securedRuns) {
    int total = 0;
    for (String s : securedRuns) {
      total += Integer.parseInt(s);
    }
    return total;
  }

  public abstract void findStarRating();
}
