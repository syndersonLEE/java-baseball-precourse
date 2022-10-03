package baseball;

import baseball.domain.Board;
import baseball.domain.Result;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        Board computerBoard = new Board();

        String gameResult = "";
        String inputStringLine = "";
        while((inputStringLine = Console.readLine()) != null && !gameResult.equals("3 스트라이크")) {
            System.out.println("숫자를 입력해 주세요 : ");
            Board userBoard = new Board(inputStringLine);
            gameResult = computerBoard.compareBoard(userBoard).getResultString();
            System.out.println(gameResult);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

}
