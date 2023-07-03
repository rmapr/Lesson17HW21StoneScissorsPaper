package game.entity;

import lombok.Data;

import java.util.List;

@Data
public class Player {
    private String name;
    private Integer numberGames = 0;
    private Integer numberWinGames = 0;
    private Integer numberDrawGames = 0;
    private List<Subj> hand = List.of(Subj.values());


    public Player(String name) {
        this.name = name;
    }
    public void incrementNumberGames(){
        numberGames++;
    }
    public void incrementNumberDrawGames(){
        numberDrawGames++;
    }
    public void incrementNumberWinGames(){
        numberWinGames++;
    }
    public String printPlayerResult(){
        return "Player " + name +  "\nPlayed: " + numberGames +
                "\nWon " + numberWinGames +
                "\nDraw " + numberDrawGames +
                "\nLost " + (numberGames - numberWinGames - numberDrawGames);
    }
}
