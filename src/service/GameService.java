package service;

import model.Game;
import model.Player;

import java.util.Scanner;

public class GameService {

    GameBoardService gameBoardService;
    Game game;

    public GameService(GameBoardService gameBoardService, Game game){
        this.gameBoardService = gameBoardService;
        this.game = game;
    }

    public void startGame(){

        while(gameBoardService.freeCellsPresent(game.getGameBoard())){
            gameBoardService.printBoard(game.getGameBoard());
            Player currentPlayer = game.getPlayers().poll();
            System.out.println("Turn: " + currentPlayer.getSymbol().getValue());

            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int j = sc.nextInt();

            gameBoardService.populate(game.getGameBoard(), i, j, currentPlayer.getSymbol().getValue());

            if(gameBoardService.isWinner(game.getGameBoard(), i , j)){
                game.setWinner(currentPlayer);
                break;
            }

            game.getPlayers().add(currentPlayer);
        }

        if(game.getWinner() == null) System.out.println("Tie");
        else System.out.println(game.getWinner().getSymbol());
    }
}
