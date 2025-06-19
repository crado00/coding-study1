import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("멜론", 10630);
        fruitPrices.put("수박", 15920);

        for (Map.Entry<String, Integer> entry: fruitPrices.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}