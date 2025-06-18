import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Banana");
        fruits.add("Apple");


        for (String fruit:fruits) {
            System.out.println(fruit.hashCode());
        }

    }
}