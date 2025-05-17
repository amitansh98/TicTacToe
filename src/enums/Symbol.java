package enums;

public enum Symbol {

    CROSS('X'),
    ZERO('0');

    private Character val;

    Symbol(Character val){
        this.val = val;
    }

    public Character getValue(){
        return val;
    }

}
