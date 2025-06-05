//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void printStudent(String name, int age) {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("--------------");

    }

    public static void main(String[] args) {
        System.out.println("===학생 정보 출력===");
        Main.printStudent("재준", 20);
        printStudent("charlie", 20);
    }
}