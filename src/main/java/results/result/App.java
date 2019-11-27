package results.result;

import Exams.Results;

public class App {
	public static void main(String[] args) {
		Results myResult = new Results();
		myResult.resultsAndTotal(50, 30, 1);

		Results myPercentage = new Results();
		myPercentage.percentCalc(50, 30, 1);

	}
}
