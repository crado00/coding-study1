import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {

       Person person = new Person();
       Car car = new Car();

       car.brand = "s";
       car.year = 1;

       person.name = "김재준";
       person.age = 27;
       person.NBTI = "ENFP";

       car.displayInfo();

       person.sayHello();
       person.work();
    }
}

class Car {
    String brand;
    int year;

    public void displayInfo() {
        System.out.println("브랜드: " + brand + " 연식: " + year);
    }
}
class Person {
    String name;
    int age;
    String NBTI;


    public void sayHello() {
        System.out.println("안녕하세요? 저는  " + name + "입니다. 저의 나이는 " + age + "세 입니다.");
    }

    public void work(){
        System.out.println("일하는 중...");
    }
}