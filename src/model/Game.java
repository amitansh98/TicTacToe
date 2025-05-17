package model;

import java.util.Queue;

public class Game {

    private GameBoard gameBoard;
    private Queue<Player> players;
    private Player winner;

    public Game(GameBoard gameBoard, Queue<Player> players){
        this.gameBoard = gameBoard;
        this.players = players;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
