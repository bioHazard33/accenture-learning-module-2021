package com.sbcc.model;

public class Player{
    private String playerId;
    private String playerName;
    private int matchesPlayed;
    private int runScored;
    private String playingZone;

    public void setPlayerId(String a){
        playerId=a;
    }

    public String getPlayerId(){
        return playerId;
    }

    public void setPlayerName(String a){
        playerName=a;
    }

    public String getPlayerName(){
        return playerName;
    }
    
    public void setMatchesPlayed(int a){
        matchesPlayed=a;
    }

    public int getMatchesPlayed(){
        return matchesPlayed;
    }

    public void setRunScored(int a){
        runScored=a;
    }

    public int getRunScored(){
        return runScored;
    }

    public void setPlayingZone(String a){
        playingZone=a;
    }

    public Stirng getPlayingZone(){
        return playingZone;
    }
}