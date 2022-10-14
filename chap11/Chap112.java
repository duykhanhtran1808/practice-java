package chap11;

import java.util.*;

public class Chap112 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Khanh", 100);
        scores.put("Huy", 50);
        scores.put("Dat", 70);

        System.out.println(scores);
        System.out.println(scores.get("Khanh"));

    }
}
