
public class B implements Player {
    final boolean[] opponentHistory;
    int recordIndex = 0;
    boolean betrayForever = false;

    public B(int maxRounds){
        this.opponentHistory = new boolean[10];
    }

    @Override
    public boolean cooperate(int round){
        if(round == 1){
            return true; // 첫 라운드는 무조건 협력
        }

        if(betrayForever){
            return false; // 배신으로 전환되면 그 이후는 계속 배신
        }

        if(round == 6){
            // 5라운드에서 상대가 배신하면 이후 모든 라운드 배신
            // (단 상대가 협력이면 그대로 6라운드 협력)
            if(opponentHistory[round - 2] == false){
                betrayForever = true; // 배신을 당했으므로 이후 배신
            }
        }

        if(round == 7){
            // 6라운드에서 상대가 배신하면 이후 모든 라운드 배신
            // (단 상대가 협력일 경우 Tit-for-Tat 그대로 적용)
            if(opponentHistory[round - 2] == false){
                betrayForever = true; // 배신을 당했으므로 이후 배신
            }
        }

        // 5라운드 전까지는 Tit-for-Tat 방식 적용
        return opponentHistory[round - 2];
    }

    @Override
    public void recordOpponentMove(boolean opponentMove){
        opponentHistory[recordIndex] = opponentMove;
        recordIndex++;
    }
}