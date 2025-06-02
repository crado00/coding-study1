//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int number = 5;

        if (number > 0) {
            System.out.println("Number는 0보다 큽니다.");
        }
        if (number < 0) {
            System.out.println("Number는 0보다 작습니다.");
        }
        if (number >= 0) {
            System.out.println("Number는 0보다 크거나 같습니다.");
        }
        if (number <= 0) {
            System.out.println("Number는 0보다 작거나 같습니다.");
        }

        if (number > 0) {
            System.out.println("number는 0보다 큽니다.");
        }else if(number < 0){
            System.out.println("number는 0보다 작습니다.");
        }else {
            System.out.println("number는 0입니다.");

        }
    }
}