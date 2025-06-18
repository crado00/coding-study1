import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        List<String>  fruits = new ArrayList<String>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("체리");
        fruits.add("용과");
        fruits.add("망고");


        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        System.out.println();

        for(String list: fruits){
            System.out.println(list);
        }

        System.out.println();

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()){
            String item = it.next();
            System.out.println(item);
        }

        System.out.println();

        Collections.sort(fruits);

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println();

        if(fruits.contains("사과")){
            System.out.println("사과는 포함 되어 있습니다.");
        }
        if(fruits.contains("키워")){
            System.out.println("사과는 포함 되어 있습니다.");
        }

        System.out.println();

        int index = fruits.indexOf("바나나");
        fruits.set(4, "오랜지");
        List<String> sliced = fruits.subList(0, 2);

        System.out.println();

        fruits.remove("바나나");
        fruits.remove(0);

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        fruits.clear();

        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        System.out.println();


    }

}

