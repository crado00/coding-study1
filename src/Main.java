import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("뽀뽀", "말티즈");
        dog.printName();

    }

}

class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void printName() {
        System.out.println("Animal name:" + name);
    }

}

class Dog extends Animal {
    String brand;

    public Dog(String name, String brand){
        super(name);
        this.brand = brand;


    }
    @Override
    public void printName(){
        System.out.println("Animal name:" + name + " Animal brand: " + brand);

    }
}