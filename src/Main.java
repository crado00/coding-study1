import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banana");
        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }
}