package com.qa.javaworkbook;

public class ResultsRunner {

	public static void main(String[] args) {
		Results Katie = new Results(145, 132, 120);
		Results George = new Results(14,84, 130);
		Results Valentine = new Results(-29, 155, 150);
		
		
		Katie.showResults();
		Katie.showPercentage();
		Katie.grade();
		Katie.singleGrade();
		System.out.println("--------------------------------------------------");
		George.showResults();
		George.showPercentage();
		George.grade();
		George.singleGrade();
		System.out.println("--------------------------------------------------");
		Valentine.showResults();

	}

}
