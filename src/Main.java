import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println("put()");
        for (Map.Entry<String, Integer> entry: fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": \t" + entry.getValue() + "원");
        }

        int sum = 0;
        System.out.println("values(), size()");

        for (int fruitPrice: fruitPrices.values()) {
            sum += fruitPrice;
        }
        System.out.println(sum / fruitPrices.size());

        System.out.println();
        System.out.println("containsKey(), containsValue()");

        System.out.println(fruitPrices.containsKey("사과"));
        System.out.println(fruitPrices.containsKey("포도"));
        System.out.println(fruitPrices.containsValue(17980));
        System.out.println(fruitPrices.containsValue(20000));

        System.out.println();
        System.out.println("getOrDefault()");

        System.out.println(fruitPrices.getOrDefault("사과", 500));
        System.out.println(fruitPrices.getOrDefault("포도", 500));

        System.out.println();
        System.out.println("replace(), remove()");

        fruitPrices.replace("사과", 100);
        fruitPrices.remove("멜론");

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println();
        System.out.println("keySet()");

        for (String key: fruitPrices.keySet()){
            System.out.println(key);
        }

    }
}