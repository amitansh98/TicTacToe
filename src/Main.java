import enums.Symbol;
import model.Game;
import model.GameBoard;
import model.Player;
import service.GameBoardService;
import service.GameService;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard(3);
        Queue<Player> players = new LinkedList<>();
        players.add(new Player(Symbol.CROSS));
        players.add(new Player(Symbol.ZERO));

        Game game = new Game(gameBoard, players);

        GameBoardService gameBoardService = new GameBoardService();

        GameService gameService = new GameService(gameBoardService, game);

        gameService.startGame();
    }
}