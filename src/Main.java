import java.util.Scanner;
/*
public class Main {
    // Payoff 상수 정의

    private static final int R = 3; // 둘 다 협력
    private static final int T = 5; // 나는 배신, 상대방 협력
    private static final int P = 1; // 둘다 배신
    private static final int S = 0; // 나는 협력, 상대방 배신

    public static void main(String[] args) {

        int rounds = 10; // 라운드 수 고정

        Player playerA[] = {new One(rounds),new One(rounds),new One(rounds),
                new One(rounds),new One(rounds),new One(rounds),
                new One(rounds),new One(rounds),new One(rounds),
                new One(rounds),};
                //짜신 코드 이름으로 바꾸시거나 클래스 이름을 One으로 바꾸시면 될거에요.
        Player playerB[] = {new TitForTat(rounds), new Alternator(), new GrimTrigger(rounds),
                new Pavlov(rounds), new PeriodicDefector(3), new Prober(rounds),
                new SuspiciousTitForTat(rounds), new TitForTat(rounds), new TitForTwoTats(rounds),
                new TitForNTats(rounds, 2)};



        int totalArary[][] = new int[2][playerB.length];

        for(int i = 0; i < playerB.length; i++){
            System.out.println(playerB[i].getClass());
            System.out.println();
            int totalA = 0, totalB = 0;
            for (int round = 1; round <= rounds; round++) {
                boolean choiceA = playerA[i].cooperate(round);
                boolean choiceB = playerB[i].cooperate(round);

                // 점수 계산
                if (choiceA && choiceB) {
                    totalA += R;
                    totalB += R;
                } else if (choiceA && !choiceB) {
                    totalA += S;
                    totalB += T;
                } else if (!choiceA && choiceB) {
                    totalA += T;
                    totalB += S;
                } else {
                    totalA += P;
                    totalB += P;
                }

                // 상대 움직임 기록
                playerA[i].recordOpponentMove(choiceB);
                playerB[i].recordOpponentMove(choiceA);

                System.out.printf(
                        "Round %2d: A=%s, B=%s → 점수 A=%d, B=%d%n",
                        round,
                        choiceA ? "협력" : "배신",
                        choiceB ? "협력" : "배신",
                        totalA,
                        totalB
                );
            }

            System.out.println("=== 최종 점수 ===");
            System.out.printf("Player A: %d점%nPlayer B: %d점%n", totalA, totalB);

            totalArary[0][i] = totalA;
            totalArary[1][i] = totalB;

            System.out.println();
            System.out.println("각각의 점수");
            for(int k = 0; k < playerB.length; k++){
                System.out.println("PlayerA: " + totalArary[0][k] + "점\t" + "PlayerB: " + totalArary[1][k]);

            }
            int totalSumA = 0;
            int totalSumB = 0;

            for (int num : totalArary[0]) {
                totalSumA += num;
            }
            for (int num : totalArary[0]) {
                totalSumB += num;
            }
            double averageA = totalSumA / playerA.length;
            double averageB = totalSumB / playerB.length;

            System.out.println();
            System.out.println("총합");
            System.out.println("PlayerA: " + totalSumA + "점\t" + "PlayerB: " + totalSumB);

            System.out.println();
            System.out.println("평균값");

            System.out.println("PlayerA: " + averageA + "점\t" + "PlayerB: " + averageB);
            System.out.print("A플레이어의 승리 수: ");
            int score = 0;
            for(int l = 0; l < playerB.length; l++){
                if(totalArary[0][l] > totalArary[1][l]){
                    score++;
                }
            }
            System.out.println(score);
            System.out.println();

        }

    }


}

 */

public class Main {
    public static void main(String[] args) {
        final int R = 3;  // 둘 다 협력,
        final int T = 5;  // 나는 배신, 상대방 협력
        final int P = 1;  // 나는 배신, 상대방 배신
        final int S = 0;  // 나는 협력, 상대반 배신

        int rounds = 10;

        Player playerA = new One(rounds);
        Player playerB = new B(rounds);

        int totalA = 0;
        int totalB = 0;


        for (int round = 1; round <= rounds; round++) {
            boolean choiceA = playerA.cooperate(round);
            boolean choiceB = playerB.cooperate(round);

            if (choiceA && choiceB) {
                totalA += R;
                totalB += R;
            } else if (choiceA && !choiceB) {
                totalA += S;
                totalB += T;
            } else if (!choiceA && choiceB) {
                totalA += T;
                totalB += S;
            } else {
                totalA += P;
                totalB += P;
            }

            playerA.recordOpponentMove(choiceB);
            playerB.recordOpponentMove(choiceA);

            System.out.printf(
                    "Round %2d: A=%s, B=%s → 점수 A=%d, B=%d%n",
                    round,
                    choiceA ? "협력" : "배신",
                    choiceB ? "협력" : "배신",
                    totalA,
                    totalB
            );
        }

        System.out.println("=== 최종 점수 ===");
        System.out.printf("Player A: %d%nPlayer B: %d%n", totalA, totalB);
    }
}

