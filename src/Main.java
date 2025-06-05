//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        int max;
        if (a > b) {
            max = a;
        }else {
            max = b;
        }
        System.out.println(max);
        System.out.println();

        int max2 = (a>b) ? a : b;
        System.out.println(max2);
        System.out.println();

        int score = 61;
        String result;

        if (score > max2) {
            result = "합격";
        }else {
            result = "불합격";
        }
        System.out.println(result);
        System.out.println();
        String color = "빨강";
        String choiceColor = (color == "빨강") ? "빨강" : (color == "파랑") ? "파랑" : "보라";
        System.out.println(choiceColor);
    }
}