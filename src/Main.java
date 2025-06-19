import java.util.*;
//제너릭 클래스
import java.util.ArrayList;
import java.util.List;

class Box {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<String> words = List.of("apple", "banana", "cherry");

        Box.displayArray(numbers);
        Box.displayArray(words);
    }
}