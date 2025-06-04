//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int number = 5;
        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        int number2 = 8;
        for (int i = 1; i <= 9; i++) {
            System.out.println(number2 + " x " + i + " = " + (number2 * i));
        }
        for (int i = 1; i <= 19; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        for (int i = 1; i <= 19; i++) {
            if (i >= 5) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
        for(int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                System.out.println("i 는 " + i);
            }
        }
        for(int i = 1; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println("i 는 " + i);
            }
        }
        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                System.out.println("i 는 " + i);
            }
        }
        for(int i = 20; i >= 1; i--) {
            if(i % 4 == 0) {
                System.out.println("i 는 " + i);
            }
        }
    }
}