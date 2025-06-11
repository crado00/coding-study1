import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("값을 입력하세요.");
        System.out.println("입력값: " + scanner.nextLine());

        System.out.println("실수값을 입력하세요");
        System.out.println("입력 실수값:" + scanner.nextDouble());
        System.out.println("프로그램 종료");
    }
}