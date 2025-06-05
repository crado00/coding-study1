//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int number = 201412;

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);
        
        System.out.println(binary);
        System.out.println(hex);

    }
}