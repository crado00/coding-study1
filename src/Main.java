class Person{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age < 18){
            System.out.println("성인만 가입 가능");
        }else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
}

class ReadOnlyStudent {
    private final int score;

    public ReadOnlyStudent(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("crado");
        person.setAge(20);

        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}

