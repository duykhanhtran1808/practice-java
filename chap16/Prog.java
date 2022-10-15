package chap16;

import java.io.*;

public class Prog {
    public static void main(String[] args) {
        // Character characterOne = new Character(100, "Mage", "Staff");
        // Character characterTwo = new Character(120, "Warrior", "Sword");
        // Character characterThree = new Character(150, "Archer", "Bow");

        // System.out.println("ABC");
        // FileOutputStream fileStream = new FileOutputStream("MyGame.ser");

        // ObjectOutputStream os = new ObjectOutputStream(fileStream);

        // os.writeObject(characterOne);
        // os.writeObject(characterTwo);
        // os.writeObject(characterThree);

        // os.close();
    }
}

class Character {
    private int power;
    private String type;
    private String weapon;

    public Character(int power, String type, String weapon) {
        this.power = power;
        this.type = type;
        this.weapon = weapon;
    }

    public int getPower() {
        return this.power;
    }

    public String getType() {
        return this.type;
    }

    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.type + " with power of " + this.power;
    }
    
}
