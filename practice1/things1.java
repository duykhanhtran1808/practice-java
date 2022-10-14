package practice1;

public class things1 {
    public static void main(String[] args) {
        boolean test = 6 > 7 ? true : false;
        double test2 = 50.6d;
        final String NAME = "Khanh";

        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
}
