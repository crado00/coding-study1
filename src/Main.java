import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("홍성현", 20);
        Person p2 = new Person("h662", 60);

        //p1.name = "김재준";
        //p2.name = "h662";

        Car c1 = new Car("Hyundai",15, "sonata");
        Car c2 = new Car("Mercedes-Benz", 23, "E320d");
        c2.nickName = "사";

        c1.displayInfo();
        c2.displayInfo();
    }
}

class Person {
    String name;
    int age;

    public Person() {}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class Car {
    String brand;
    int year;
    String model;
    String nickName;
    public Car(String brand, int year, String model){
        this.brand = brand;
        this.year = year;
        this.model = model;
    }
    public Car(String brand, int year, String model, String nickName){
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.nickName = nickName;
    }

    public void displayInfo(){
        System.out.println("브랜드: " + brand + " 연식: " + year + " 모델명: " + model + (this.nickName != null ?  " 별명: "+ this.nickName : ""));
    }
}