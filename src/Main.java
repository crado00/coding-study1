import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Double> values = Arrays.asList(10.0, 20.0, 30.0, 40.0, 50.0);

        double avg = values.stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0);

        System.out.println(avg);
    }
}