public class DefenseStrategy {

    public static class ShieldDefense implements DefendStyle {
        public String defendModes() {
            String output = new String();
            System.out.println("Knight Defenses Activated: Knight activates shield for defense!");


            output += "Shield Risen!";
            return output;
        }
    }

    public static class DodgeDefense implements DefendStyle {
        public String defendModes() {
            String output = new String();
            System.out.println("Dodge Stance: Dodge Activated has been made!");

            return output;
        }
    }

    public static class CreateMagicBarrier implements DefendStyle {
        public String defendModes() {
            String output = new String();
            System.out.println("Mage Defense Stance: Spell has been casted for a shield barrier for protection!");

            output += "Magic Barrier Synchronized -Protego Totaluma!";
            return output;
        }
    }


}
