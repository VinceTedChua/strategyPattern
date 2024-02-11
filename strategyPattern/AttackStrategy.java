public class AttackStrategy {


    public static class CastSpell implements AttackStyle {
        public String attackModes() {
            String output = new String();
            System.out.println("Mage Attack Mode: Wizard casts a spell!");

            output += "Spell Casted- Wingardium Leviosa!";
            return output;
        }
    }


    public static class ShootArrow implements AttackStyle {
        public String attackModes() {
            String output = new String();
            System.out.println("Archer Attack Mode: Archer shoots an arrow!");

            output += "Arrow Shot Striker!";
            return output;
        }
    }
        public static class SwingSword implements AttackStyle {
            public String attackModes() {

                String output = new String();
                System.out.println("Knight Attack Mode: Knight attacks with a sword!");


                output += "Swing Slash Sword!";
                return output;
            }
        }
    }

