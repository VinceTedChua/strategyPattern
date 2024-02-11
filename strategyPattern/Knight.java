
public class Knight {

    private AttackStyle attackStyle;
    private DefendStyle defendStyle;


    public Knight (AttackStyle attackStyle, DefendStyle defendStyle) {
        this.attackStyle = attackStyle;
        this.defendStyle = defendStyle;
    }

    public String attackModes(){
        return "Knight has swung it's sword " + attackStyle.attackModes();
    }

    public String defendModes(){
        return "Knight has protected itself " + defendStyle.defendModes();
    }
}

