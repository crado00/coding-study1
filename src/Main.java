//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        if(age >= 18 && hasID) {
            System.out.println("접속 가능.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if(isWeekend || isHoliday) {
            System.out.println("쉴 수 있습니다.");
        }

        boolean isRainging = true;
        if(!isRainging) {
            System.out.println("그냥 나가");
        }else {
            System.out.println("우산 챙겨");
        }
    }
}