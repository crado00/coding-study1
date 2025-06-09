import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        String message = "Hello, Java!";

        System.out.println(message.length());
        System.out.println(message);
        System.out.println(message.indexOf("J"));
        System.out.println(message.charAt(5));



        System.out.println();

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == 'l') {
                System.out.println(message.charAt(i));
                break;
            }
        }

        System.out.println(message.substring(0));
        System.out.println(message.substring(1));
        System.out.println(message.substring(2, 3));

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";
        System.out.println(address.substring(0, 7)
                + "..."
                + address.substring(address.length() - 5));
    }
}