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
		if (physPercentage < 60 || bioPercentage < 60 || chemPercentage < 60) {
			System.out.println("I'm sorry, you have failed the following:");
		} if (physPercentage < 60) {
			System.out.println("- physics.");
		} if (chemPercentage < 60) {
			System.out.println("- chemistry.");
		} if (bioPercentage < 60) {
			System.out.println("- biology.");
		}

	}

}
