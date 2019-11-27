package Exams;

public class Results {

	public void resultsAndTotal(int physMark, int chemMark, int bioMark) {
		int totalMark = physMark + chemMark + bioMark;
		System.out.println("Physics mark: " + physMark);
		System.out.println("Chemistry mark: " + chemMark);
		System.out.println("Biology mark: " + bioMark);
		System.out.println("Total mark: " + totalMark);

	}

	public void percentCalc(int physMark, int chemMark, int bioMark) {
		int totalPercentage = (physMark + chemMark + bioMark) * 100 / 150;
		int physPercentage = (physMark / 50) * 100;
		int chemPercentage = (chemMark / 50) * 100;
		int bioPercentage = (bioMark / 50) * 100;
		System.out.println("Physics percentage: " + physPercentage + "%");
		System.out.println("Chemistry percentage: " + chemPercentage + "%");
		System.out.println("Biology percentage: " + bioPercentage + "%");
		System.out.println("Total percentage: " + totalPercentage + "%");
		if (physPercentage < 60) {
			System.out.println("I'm sorry, you have failed physics.");
		} else if (chemPercentage < 60) {
			System.out.println("I'm sorry, you have failed chemistry.");
		} else if (bioPercentage < 60) {
			System.out.println("I'm sorry, you have failed biology.");
		} else if (totalPercentage < 60) {
			System.out.println("I'm sorry, you have failed everything.");
		}

	}

}
