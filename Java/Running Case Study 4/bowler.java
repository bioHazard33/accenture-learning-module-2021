package com.sbcc.model;

/*The class and methods should be declared as publicand all the attributes should be declared as private.*/public class Bowler
  extends Player {

  private int noOfMaiden;
  private int noOfHattrick;
  private double starRating;

  public int getNoOfMaiden() {
    return this.noOfMaiden;
  }

  public double getStarRating() {
    return this.starRating;
  }

  public int getNoOfHattrick() {
    return this.noOfHattrick;
  }

  public void setNoOfHattrick(int noOfHattrick) {
    this.noOfHattrick = noOfHattrick;
  }

  public void setNoOfMaiden(int noOfMaiden) {
    this.noOfMaiden = noOfMaiden;
  }

  public void setStarRating(double starRating) {
    this.starRating = starRating;
  }

  public Bowler() {}

  public Bowler(
    String playerId,
    String playerName,
    int matchesPlayed,
    int runScored,
    String playingZone,
    int noOfMaiden,
    int noOfHattrick
  ) {
    setPlayerId(playerId);
    setPlayerName(playerName);
    setMatchesPlayed(matchesPlayed);
    setRunScored(runScored);
    setPlayingZone(playingZone);
    setNoOfMaiden(noOfMaiden);
    setNoOfHattrick(noOfHattrick);
  }

  public void findStarRating() {
    setStarRating(
      ((getNoOfMaiden() * 5.0) + (getNoOfHattrick() * 10.0)) *
      getMatchesPlayed() /
      100
    );
  }
}
