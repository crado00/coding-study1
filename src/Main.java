import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = "";
        int balance;

        System.out.println("금액을 넣어주세요.");
        balance = scanner.nextInt();


        while (true){
            System.out.println("=== 자판기 메뉴 ===");
            System.out.println("잔금: " + balance + "원");
            System.out.println("1: 멜론소다(1000)\n2: 콜라(1400)\n3: 사이다(1500)");
            System.out.println("4: 데자와(1500)\n5: 포카리스웨트(1800)\n6: 파웡에이드(1700)");
            System.out.println("0: 종료");
            int choice = scanner.nextInt();

            switch (choice){
                case 0:
                    item = "종료";
                    break;
                case 1:
                    if(balance - 1000 < 0){
                        break;
                    }
                    item = "멜론소다";
                    balance -= 1000;
                    break;

                case 2:
                    if(balance - 1600 < 0){
                        break;
                    }
                    item = "콜라";
                    balance -= 1600;
                    break;

                case 3:
                    if(balance - 1500 < 0){
                        break;
                    }
                    item = "사이다";
                    balance -= 1500;
                    break;

                case 4:
                    if(balance - 1500 < 0){
                        break;
                    }
                    item = "데자와";
                    balance -= 1500;
                    break;

                case 5:
                    if(balance - 1800 < 0){
                        break;
                    }
                    item = "포카리스웨트";
                    balance -= 1800;
                    break;

                case 6:
                    if(balance - 1700 < 0){
                        break;
                    }
                    item = "파워에이드";
                    balance -= 1700;
                    break;

                default:
                    System.out.println("다시 입력해 주세요");
            }

            if(item != ""){
                if(item == "종료"){
                    System.out.println("종료되었습니다. 커스름돈은 " + balance + "원 입니다.");
                    break;

                }
                    System.out.println(item != "" ? "당신이 선택한 음료는 " + item + "입니다." : "다시 입력해 주세요.");
                    System.out.println("잔금이" + balance + "만큼 있습니다.");
                    item = "";
                    System.out.println();

            }else {
                System.out.println("잔액이 부족합니다.");
                System.out.println("잔금이 " + balance + "원 만큼 있습니다.");
                System.out.println("금액을 추가해 주세요.(구메 종료: 0)");
                int addAmount = scanner.nextInt();

                if(addAmount == 0){
                    System.out.println("종료되었습니다. 커스름돈은 " + balance + "원 입니다.");
                    break;

                }else {
                    balance += addAmount;
                    System.out.println("총 금액은 " + balance + "입니다.");
                }

            }
        }
        
    }

}