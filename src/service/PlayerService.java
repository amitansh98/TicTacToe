package service;

import enums.Symbol;
import model.Player;

public class PlayerService {

    public Player createPlayer(Symbol symbol){
        return new Player(symbol);
    }
}
