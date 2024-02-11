
//Vince Ted Matthew D. Chua
//February 12th, 2024
//Strategy Pattern Laboratory Week 3-4

public class Character {
    private AttackStyle attackStyle;

    private DefendStyle defendStyle1;
    private DefendStyle defendStyle2;
    private DefendStyle defendStyle3;

    public Character(AttackStyle attackStyle, DefendStyle defendStyle1,
                     DefendStyle defendStyle2, DefendStyle defendStyle3) {
        this.attackStyle = attackStyle;
        this.defendStyle1 = defendStyle1;
        this.defendStyle2 = defendStyle2;
        this.defendStyle3 = defendStyle3;
    }

    public void attackModes() {
        System.out.println(attackStyle.attackModes());
    }

    public void defendModes() {
        System.out.println("\nMultiple Defenses activated: ");
        //In this case we evaluate whether the defense stances will not be null
        // Imagine this:
        //Defense Style is my Shield
        //Defend Style is 1 : Dodge
        //Defend Style is 2 : Magic Barrier
        if (defendStyle1 != null)
            System.out.println("Defense Style 1: ");
            defendStyle1.defendModes();

        if (defendStyle2 != null)
            System.out.println("Defense Style 2: ");
            defendStyle2.defendModes();

        if (defendStyle3 != null)
            System.out.println("Defense Style 3: ");
            defendStyle3.defendModes();
    }
//We printed Knight for:
    //1 attack & 3 defense types

    //As for mages and archers
    //1 attack & 3 defense re-implemented to show same consistency as the knight
    // but for their own classes which shows only 1 strategies or 3
    //I just filled in the null gaps to make it consistent
    public static void main(String[] args) {
        Character knight = new Character(new AttackStrategy.SwingSword(),    new DefenseStrategy.ShieldDefense(), new DefenseStrategy.DodgeDefense(),
                                                                             new DefenseStrategy.CreateMagicBarrier());

        Character wizard = new Character(new AttackStrategy.CastSpell(),     new DefenseStrategy.CreateMagicBarrier(), new DefenseStrategy.CreateMagicBarrier(), new DefenseStrategy.CreateMagicBarrier());
        Character archer = new Character(new AttackStrategy.ShootArrow(),    new DefenseStrategy.DodgeDefense(), new DefenseStrategy.DodgeDefense(), new DefenseStrategy.DodgeDefense());

        System.out.println("In a world where destruction uprises, the three great heroes reunited namely: The Knight, Magical Wizard and the Mighty Sparrow!");

        System.out.println("\nKnight Behavior: ");
        knight.attackModes();
        knight.defendModes();

        System.out.println("\nMage Behavior: ");
        wizard.attackModes();
        wizard.defendModes();

        System.out.println("\nArcher Behavior: ");
        archer.attackModes();
        archer.defendModes();

        System.out.println("\nGaming Program will now terminate......");
        System.out.println("5......");
        System.out.println("4......");
        System.out.println("3......");
        System.out.println("2......");
        System.out.println("1......");
        System.out.println("Shutting Down......");
    }
}
