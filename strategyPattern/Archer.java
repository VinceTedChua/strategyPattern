
public class Archer {

    private AttackStyle attackStyle;
    private DefendStyle defendStyle;


    public Archer (AttackStyle attackStyle, DefendStyle defendStyle) {
        this.attackStyle = attackStyle;
        this.defendStyle = defendStyle;
    }

    public String attackModes(){
        return "Archer has deployed " + attackStyle.attackModes();
    }

    public String defendModes(){
        return "Archer protects " + defendStyle.defendModes();
    }
}


