package model;

public class GameBoard {

    Character[][] board;
    int size;

    public GameBoard(int size){
        this.size = size;
        this.board = new Character[size][size];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++) board[i][j] = '*';
        }
    }

    public Character[][] getBoard() {
        return board;
    }
}
