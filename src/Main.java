//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 5){
            System.out.println(i);
            i++;
        }
        int j = 0;
        do {
            System.out.println(j);
            j++;
        }while(j < 5);


        int input = 0;

        do {
            System.out.println("안녕하세요 자판기 입니다.");

            switch (input) {
                case 1:
                    System.out.println("콜라");
                    break;
                case 2:
                    System.out.println("사이다");
                    break;
                case 3:
                    System.out.println("물");
                    break;
                default:
                    System.out.println("잘못 고름ㅋ");
            }
        } while(input != 0);

    }
}