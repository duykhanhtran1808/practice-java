package chap12;
import java.util.*;
import java.util.stream.*;

public class Chap12 {
    public static void main(String[] args) {
        Chap12 chap12test = new Chap12();
        chap12test.tryStream2();
    }

    public void tryStream() {
        List<String> strings = List.of("Dan Truong", "Xuan Bac", "Tu Long", "Lam Truong", "Le Hieu");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(3);
        System.out.println("limit = " + limit);
        // long result = limit.count();
        // System.out.println("item count = " + result);
        List<String> result = limit.collect(Collectors.toList());
        System.out.println("result = " + result);

        List<String> strings2 = List.of("Tran Thanh", "Truong Giang", "Hoai Linh", "Dien Hai", "Nhu Lon");
        List<String> results2 =  strings2.stream().limit(3).collect(Collectors.toList());
        System.out.println("result2 = " + results2);

    }
    public void tryStream2() {
        List<String> strings2 = List.of("Tran Thanh", "Truong Giang", "Hoai Linh", "Dien Hai", "Nhu Lon");
        List<String> results2 =  strings2.stream()
        .sorted((o1, o2) -> o1.compareToIgnoreCase(o2))
        .limit(3).collect(Collectors.toList());
        System.out.println("result2 = " + results2);

    }
}


