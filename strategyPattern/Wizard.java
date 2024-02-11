
public class Wizard {

    private AttackStyle attackStyle;
    private DefendStyle defendStyle;


    public Wizard (AttackStyle attackStyle, DefendStyle defendStyle) {
        this.attackStyle = attackStyle;
        this.defendStyle = defendStyle;
    }

    public String attackModes(){
        return "Wizard has cultivated " + attackStyle.attackModes();
    }

    public String defendModes(){
        return "Wizard has set-up a barrier " + defendStyle.defendModes();
    }
}

