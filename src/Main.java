abstract class Animal {
    abstract void makeSound();

    public void sleep() {
        System.out.println("Zzz... 자는중...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("멍머엄어멍머어!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.makeSound();
        dog.sleep();
    }
}