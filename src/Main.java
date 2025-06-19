import java.util.*;
//제너릭 클래스
class  Box<T> {
    private T constent;

    public Box(T constent) {
        this.constent = constent;
    }

    public T getConstent(){
        return constent;
    }

    public void setConstent(T constent){
        this.constent = constent;
    }

    public <E> void printContent(E extranInfo) {
        System.out.println("content: " + constent + " Extra: " + extranInfo);
    }
}
//기존 생성자
class StringBox {
    private String content;

    public  StringBox(String content) {
        this.content = content;
    }
}

class IntegerBox {
    private Integer content;
}
public class Main {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<String>("나는 커서 훌륭한 박스가 될거야!");

        System.out.println(stringBox.getConstent());
        stringBox.setConstent("실패!");
        System.out.println(stringBox.getConstent());

        stringBox.printContent(123);
    }
}