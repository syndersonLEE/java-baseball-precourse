package baseball.utility;

public class InputValidation {
	private static int MAX_NUMBER = 9;
	private static int MIN_NUMBER = 1;
	private static int NUMBER_LENGTH = 3;

	public static void validIntegerFormat(String inputString) {
		try {
			validStringLength(inputString);
			for(int i = 0; i < inputString.length(); i++) {
				Integer inputNumber = Integer.parseInt(inputString);
				validNumber(inputNumber);
			}
		} catch (RuntimeException e) {
			throw new IllegalArgumentException();
		}
	}
	public static void validStringLength(String inputString) {
		if(inputString.length() != NUMBER_LENGTH) {
			throw new IllegalArgumentException();
		}
	}
	public static void validNumber(int inputNumber) {
		if(MIN_NUMBER > inputNumber && MAX_NUMBER < inputNumber) {
			throw new IllegalArgumentException();
		}
	}

}
