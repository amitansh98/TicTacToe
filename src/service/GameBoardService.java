package service;

import model.GameBoard;

public class GameBoardService {

    public void populate(GameBoard gameBoard, int i, int j, Character symbol){
        gameBoard.getBoard()[i][j] = symbol;
    }

    public void printBoard(GameBoard gameBoard){
        for(int i = 0; i < gameBoard.getBoard().length; i++){
            for(int j = 0; j < gameBoard.getBoard()[0].length; j++){
                System.out.print(gameBoard.getBoard()[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public boolean freeCellsPresent(GameBoard gameBoard) {

        for(int i = 0; i < gameBoard.getBoard().length; i++){
            for(int j = 0; j < gameBoard.getBoard()[0].length; j++){
                if(gameBoard.getBoard()[i][j] == '*') return true;
            }
        }

        return false;
    }

    public boolean isWinner(GameBoard gameBoard, int row, int column) {

        boolean vertical = true;
        boolean horizontal = true;
        boolean left = true;
        boolean right = true;

        Character cur = gameBoard.getBoard()[row][column];

        for(int i = 0; i < gameBoard.getBoard().length; i++){
            if(gameBoard.getBoard()[i][column] != cur) vertical = false;
        }

        for(int j = 0; j < gameBoard.getBoard()[0].length; j++){
            if(gameBoard.getBoard()[row][j] != cur) horizontal = false;
        }

        for(int i = 0, j = 0; i < gameBoard.getBoard().length && j < gameBoard.getBoard()[0].length; i++, j++){
            if(gameBoard.getBoard()[i][j] != cur) left = false;
        }

        for(int i = gameBoard.getBoard().length-1, j = 0; i >= 0 && j < gameBoard.getBoard()[0].length; i--, j++){
            //System.out.println(i + " " + j);
            if(gameBoard.getBoard()[i][j] != cur) right = false;
        }

        return vertical || horizontal || left || right;
    }
}
