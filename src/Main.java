class Animal {
    public void makeSound(){
        System.out.println();
    }
}

class Dog extends Animal {
    @Override
    public void makeSound(){
        System.out.println("멈멍!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("야옹야옹!");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound(){
        System.out.println("짹짹!");
    }
}

class Quokka extends Animal {
    @Override
    public void makeSound(){
        System.out.println("퀔퀔!");
    }
}


abstract class Shape {
    final double pi = Math.PI;
    public abstract  double area();
}

class Circle extends Shape{
    int r;
    public Circle(int r){
        this.r = r;
    }
    @Override
    public double area() {
        double area = pi * r * r;
        return area;
    }
}

class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        double area = width * height;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        //Animal a1 = new Dog();
        //Animal a2 = new Cat();
        //Animal a3 = new Bird();
        //Animal a4 = new Quokka();

        //a1.makeSound();
        //a2.makeSound();
        //a3.makeSound();
        //a4.makeSound();

        Shape[] shapes = new Shape[2];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);

        for(Shape shape : shapes){
            System.out.println("도형의 넓이는" + shape.area() + "입니다.");
        }

    }
}

