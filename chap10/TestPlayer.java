package chap10;

public class TestPlayer {
    public static void main(String[] args) {
        System.out.println(Player.playerCount);
        Player joe = new Player("joe");
        System.out.println(Player.playerCount);
        joe.printName();
        System.out.println(Player.REFNUM);
        System.out.println(Player.REFNUM);

        FamilyName.printThings();
        System.out.println(FamilyName.MY_NAME);
    }
}

class Player {
    static int playerCount = 0;
    public static final int REFNUM;
    static {
        REFNUM = 6;
    }
    private String name;
    public Player(String nameSet) {
        this.name = nameSet;
        playerCount++;
    }
    public void printName() {
        System.out.println(this.name);
    }
}

abstract class FamilyName {
    public static final String MY_NAME = "Khanh Dai Nhan";
    public static void printThings() {
        System.out.println("I am so alone");
    }
}
