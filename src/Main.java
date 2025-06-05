import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {



    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        int number = addNum(10, 7);
        int number2 = addNum(5, 6);

        System.out.println(number);
        System.out.println(number2);
    }
}