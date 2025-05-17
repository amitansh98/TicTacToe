package model;

import enums.Symbol;

public class Player {

    Symbol symbol;

    public Player(Symbol symbol){
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }
}
