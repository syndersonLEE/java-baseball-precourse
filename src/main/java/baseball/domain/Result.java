package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Result {
	private List<Status> result = new ArrayList<>();

	public Result(){}

	public void addResult(Status gameResult) {
		this.result.add(gameResult);
	}

}
