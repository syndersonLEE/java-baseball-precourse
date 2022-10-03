package baseball.domain;

import java.util.ArrayList;
import java.util.List;

import baseball.utility.InputValidation;
import camp.nextstep.edu.missionutils.Randoms;

public class Board {
	private List<Ball> board;

	private Board(List<Ball> ballList) {
		this.board = ballList;
	};

	public Board makeComputerBoard() {
		List<Ball> ballList = new ArrayList<>();
		for(int i = 0; i < 3; i++) {
			ballList.add(new Ball(Randoms.pickNumberInRange(1, 9), i));
		}
		return new Board(ballList);
	}

	public Board makeUserBoard(String inputNumber) {
		InputValidation.validIntegerFormat(inputNumber);
		List<Ball> ballList = new ArrayList<>();
		for(int i = 0 ; i < inputNumber.length(); i++) {
			ballList.add(new Ball(Integer.getInteger(inputNumber, i), i));
		}
		return new Board(ballList);
	}


	public Result compareBoard(Board userBoard) {
		Result gameResult = new Result();
		Board computerBoard = makeComputerBoard();

		for(Ball ball : userBoard.board) {
			Status status = ball.compareBall(computerBoard.board);
			gameResult.addResult(status);
		}
		return gameResult;
	}

}
