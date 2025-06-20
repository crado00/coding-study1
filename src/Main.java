import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        MyTread tread = new MyTread();
        tread.start();
        tread.run();

        System.out.println("나를 막지마");
    }
}

class MyTread extends Thread    {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Thread: " + i);

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}