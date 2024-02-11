# STRATEGY-PATTERN

The Strategy Pattern is a behavioral design pattern that enables defining a family of algorithms, encapsulating each one, and making them interchangeable. It allows the algorithm to vary independently from clients that use it. 

# Benefits of Using Strategy Pattern

1) Flexibility: The Strategy Pattern allows for easy swapping of algorithms at runtime, making the code more flexible and adaptable to changing requirements.
2) Encapsulation: Each algorithm is encapsulated within its own class, promoting better code organization and maintainability.
3) Reusability: Strategies can be reused in multiple contexts, reducing code duplication and promoting code reuse.
4) Testability: By isolating algorithms into separate classes, unit testing becomes easier, as each strategy can be tested independently.
5) Decoupling: The Strategy Pattern helps in decoupling the client code from the implementation details of the algorithms, leading to loosely coupled systems that are easier to maintain and extend.

Problem scenario:

Suppose we have three types of characters in a GameApp:

1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. Wizard: Casts spells; uses magic barrier to defend
3. Archer: Shoots arrows; uses dodge to to defend

Implement two types of Strategy:
A.  DefenseStrategy
     1. Shield
     2. Dodge
     3. CreateMagic

B.  AttackStrategy
     1.  CastSpell
     2.  ShootArrow
     3.  SwingSword  


Refactor the existing codes and provide the UML Diagram:

public class Character {
    private String type;

    public Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}


# UML-DIAGRAM IMPLEMENTATION

<img width="1284" alt="CSL322-18_UML_STRATEGY_PATTERN_WK3-4_CHUA_VINCE" src="https://github.com/VinceTedChua/strategyPattern/assets/142372312/072f0546-f7a7-4a06-9d24-b7712fec915d">






# JAVA Code-Solutions

In the figure below show(s) the conditions implementing the ideals of Defense Styles exclusively for Knight Implementing:

Knight - 1 Physical (Melee) Attack & 3 Defense
Mage   - 1 Spell (Power) Attack & 1 Defense (It is still 1 defense due to its exclusivity only for one class)
Archer - 1 Bow   (Range) Attack & 1 Defense (It is still 1 defense due to its exclusivity only for one class)
![DEFENSE_STRATEGY](https://github.com/VinceTedChua/strategyPattern/assets/142372312/9f2f5370-48a5-4f4f-8bc7-e8fac56b4938)



Strategy Pattern #1: Shows how Knight is executed:

![STRATEGY_PATTERN_1_JAVA](https://github.com/VinceTedChua/strategyPattern/assets/142372312/1f023fdc-804f-481a-ba4c-ab78c781cd71)


Strategy Pattern #2: Shows how Mage is executed:

![STRATEGY_PATTERN_2_JAVA](https://github.com/VinceTedChua/strategyPattern/assets/142372312/c96edb2a-ae0a-4597-8930-e2a34d3b999a)


Strategy Pattern #3: Shows how Archer is executed:

![STRATEGY_PATTERN_3](https://github.com/VinceTedChua/strategyPattern/assets/142372312/7879637c-821d-4c3f-bead-5ddf58e48ec0)



