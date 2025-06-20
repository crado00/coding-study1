import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numbers.stream();

        int result = numbers.stream()
                .filter((n ) -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(result);
        /*
        System.out.println();
        int sum = 0;
        for (int i = 0; i < numbers.size(); i ++){
            if(numbers.get(i) % 2 == 0){
                sum += numbers.get(i);
            }
        }
        System.out.println(sum);

         */
    }
}