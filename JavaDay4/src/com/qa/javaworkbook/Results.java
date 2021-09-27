
package com.qa.javaworkbook;

/*
 * A person takes 3 exams in college, Physics, Chemistry and Biology, each
exam can have a maximum of 150 marks. When all the exam marks have
been added together, we can find the overall percentage that the person has
got by multiplying their score by 100 and then dividing by 450.
9 Create the results class, this class has 5 variables, Physics, Chemistry and
Biology, total and percentage. This class should also have 2 methods:
a. Method 1 - displays the results that the person got for each exam
and then the total mark. Try to make the output neat and
bespoke for each exam.
b. Method 2 - which finds and displays the percentage that the
person received for the exams overall.
10 Expand the Results project, there is now a pass rate of 60% for the
overall result; if the person receives under 60%, they get a fail message.
11 Expand the previous example so that even if the person gets higher
than 60% overall, if they fail 1 or more of the exams (pass grade of 60%
for each exam) they still fail overall.
12 Expand the above so that the message that is displayed varies
depending on the number of subjects that they have failed.

Expand the results class so that the variables are now private and can
only be accessed through public methods.
30 Modify these methods so that they do not allow the variables to be set
to values that are less than 0 or greater than 150.
31 Now we have an issue in that the method that calculates the result will
still run even if invalid data is entered, for example if the user tries to set
the Physics mark to be 200 this is not allowed. But the defaults score of
0 can still be used in the method to calculate the results. Modify the
class to stop this from happening.


 */

public class Results {
	
	 private int physics;
	 private int chemistry;
	 private int biology;
	 private int total;
	 private double percentage;
	 private double phyPerc;
	 private double chemPerc;
	 private double bioPerc;
	
	public Results(int physics, int chemistry, int biology) {
		super();
		this.physics = physics;
		this.chemistry = chemistry;
		this.biology = biology;
	}
	 public void checkResults() {
		 
	 }
	
	public boolean showResults() {
		int total = physics + chemistry + biology;
		
		if (physics > 150 ||physics < 0) {
			
			 System.out.println("Physics: Not a valid result");
			 boolean phyok = false;
			 if (phyok != false) {
				 System.out.println("\t You got " + physics + "/150 for your physics exam.");
				 return phyok;
			 }
		 }
		 if (chemistry > 150 ||chemistry < 0) {
			
			 System.out.println("Chemistry: Not a valid result");
			 boolean chemok = false;
			 if (chemok != false) {
				 System.out.println("\t You got " + chemistry + "/150 for your physics exam.");
				 return chemok;
			 }
		 }
		 if (biology > 150 ||biology < 0) {
			
			 System.out.println("Biology: Not a valid result");
			 boolean biook = false;
			 if (biook != false) {
				 System.out.println("\t You got " + biology + "/150 for your physics exam.");
				 return biook;
		 }
		 }
		 
	checkResults();
		showResults();
		
		//int total = physics + chemistry + biology;
//		//System.out.println("\t You got " + physics + "/150 for your physics exam.");
//		System.out.println("\t You got " + chemistry + "/150 for your chemistry exam.");
//		System.out.println("\t You got " + biology + "/150 for your biology exam.");
		System.out.println("\t You got " + total + "/450 in total for these exams.");
		 }
		
	}
	public double showPercentage() {
		total = physics + chemistry + biology;
		double percentage = ((total *100)/450);
		System.out.println("\t You got a total percentage of " + percentage + "%");
		return percentage;
	}
	
	public void grade() {
		total = physics + chemistry + biology;
		double percentage = ((total *100)/450);
		if (percentage < 60.00) {
			System.out.println("\t You fail!!");
		}
		if (percentage >= 60.00) {
			System.out.println("\t You have passed");
		} 
		}
		
	public void singleGrade() { // this is only printing passed even if they havent!
		double phyPerc = (physics * 100) /150;
		double chemPerc = (chemistry * 100) /150;
		double bioPerc = (biology * 100) /150;
		if (phyPerc < 60.00) {
			System.out.println("\t You have failed your physics exam");
		} if (phyPerc >= 60.00) {
			System.out.println("\t You have passed your physics exam");
		} if (chemPerc < 60.00) {
			System.out.println("\t You have failed your chemistry exam");
		} if (chemPerc >= 60.00) {
			System.out.println("\t You have passed your chemistry exam");
		} if (bioPerc < 60.00) {
			System.out.println("\t You have failed your biology exam");
		} if (bioPerc >= 60.00) {
			System.out.println("\t You have passed your biology exam");
		} 
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getPhyPerc() {
		return phyPerc;
	}

	public void setPhyPerc(double phyPerc) {
		this.phyPerc = phyPerc;
	}

	public double getChemPerc() {
		return chemPerc;
	}

	public void setChemPerc(double chemPerc) {
		this.chemPerc = chemPerc;
	}

	public double getBioPerc() {
		return bioPerc;
	}

	public void setBioPerc(double bioPerc) {
		this.bioPerc = bioPerc;
	}
		

	
	
	

	

}
