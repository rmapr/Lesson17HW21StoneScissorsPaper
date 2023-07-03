package game;

import game.entity.Computer;
import game.entity.MatrixOfResults;
import game.entity.Player;
import game.service.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome in game Stone-Scissors-Paper ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name player: ");
        String name = sc.nextLine();
        System.out.println("Enter number of games [more then 0]: ");
        int countGame = sc.nextInt();

        Player player = new Player(name);
        Computer computer = new Computer();
        Service service = new Service();
        MatrixOfResults matrixOfResults = new MatrixOfResults();
        String playerName = player.getName();

        String nextGame = "y";
        int numGame = 1;
        do {
            System.out.println("-------------------");
            System.out.println("Game " + numGame + " from " + countGame);

            Integer playerSubj = service.getPlayerSubj(sc);
            sc.nextLine();
            String playerNameSubj = player.getHand().get(playerSubj).getName();
            System.out.println("Player - " + playerName + " " + playerNameSubj);

            Integer compSubj = service.computerResult();
            String compName = computer.getHand().get(compSubj).getName().toUpperCase();
            System.out.println("Computer - " + compName + " " + compSubj);


            Integer resultWinner = matrixOfResults.getMatrixOfResult(playerSubj, compSubj);
            player.incrementNumberGames();
            switch (resultWinner){
                case 0, 3, 4 -> player.incrementNumberWinGames();
                case 6, 7, 8 -> player.incrementNumberDrawGames();
            }
            matrixOfResults.printWinner(resultWinner);

            if (numGame++ != countGame) {
                System.out.println("We play again [y/n]");
                nextGame = sc.nextLine();
            } else {
                break;
            }
        } while (!nextGame.equalsIgnoreCase("n"));
        System.out.println("\nScore: " + player.printPlayerResult());
    }
}
