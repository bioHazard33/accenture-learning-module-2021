package com.sbcc.model;

public class Batsman extends Player {

  private double starRating;
  private int noOfHundreds, noOfFifties;

  public void setNoOfHundreds(int noOfHundreds) {
    this.noOfHundreds = noOfHundreds;
  }

  public int getNoOfHundreds() {
    return this.noOfHundreds;
  }

  public void setNoOfFifties(int noOfFifties) {
    this.noOfFifties = noOfFifties;
  }

  public int getNoOfFifties() {
    return this.noOfFifties;
  }

  public double getStarRating() {
    return this.starRating;
  }

  public void setStarRating(double starRating) {
    this.starRating = starRating;
  }

  public void findStarRating() {
    setStarRating(
      ((getNoOfFifties() * 5.0) + (getNoOfHundreds() * 10)) *
      getMatchesPlayed() /
      100
    );
  }

  public Batsman() {}

  public Batsman(
    String playerId,
    String playerName,
    int mathesPlayed,
    int runScored,
    String playingZone,
    int noOfHundreds,
    int noOfFifties
  ) {
    setPlayerId(playerId);
    setPlayerName(playerName);
    setMatchesPlayed(mathesPlayed);
    setRunScored(runScored);
    setPlayingZone(playingZone);
    setNoOfHundreds(noOfHundreds);
    setNoOfFifties(noOfFifties);
  }
}
