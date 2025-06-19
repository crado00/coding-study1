import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(10,20,30);

        System.out.println(sumList(intList));
    }
    public static double sumList(List<? extends Number> list) {
        double sum = 0;

        for(Number n: list) {
            sum += n.doubleValue();
        }

        return sum;
    }
}