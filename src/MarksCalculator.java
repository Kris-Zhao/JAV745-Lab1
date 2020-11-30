/**
 * This MarksCalculator class has been developed in order to calculate a final grade for each entered student. 
 * My program loops until all students have been entered. For each student, the following must be entered, including student name,
 * Assignment1, Assignment2, Test1, Test2, Test3, Labs, Final Exam. Finally, displaying y values entered for each student, a note 
 * telling the operator which test was dropped, an assigned final mark and letter grade in a pleasing format.
 * At the end of the run of the application list the percentage of students obtaining each letter grade and the class average.
 * 
 * Question4 of Lab1. 
 * @author Yuhang Zhao, student number 150467199
 *
 */

import java.util.Scanner;

public class MarksCalculator {
	/**
	 * This main method mainly loops all students and enters all required values for each student, and according to the rule and
	 * Seneca's Academic Policy to get the corresponding letter grade based on the calculated final grade of each student. It is 
	 * worth noticing to drop the lowest Test Mark. 
	 * After entering values and running this code, it would display all values entered for each student, a note telling the operator 
	 * which test was dropped, an assigned final mark and letter grade.
	 * At the end of the run of the application list the percentage of students obtaining each letter grade and the class average.
	 * @param args
	 * 
	 * 
	 */

	public static void main(String[] args) {
    		
		// TODO Auto-generated method stub
		int i;
		double Aplus = 0, A=0, Bplus=0, B=0, Cplus=0, C=0, Dplus=0, D=0, F=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students do you have?");
		String number = input.nextLine();
		int realnumber = Integer.parseInt(number);
		
		String StudentName[] = new String[realnumber];
		
		String note[] = new String[realnumber];
		
		String gradeLetter[] = new String[realnumber];
		
		double Assignment1[] = new double[realnumber];
		double Assignment2[] = new double[realnumber];
		
		double TestFinal[] = new double[realnumber];
		double Test1[] = new double[realnumber];
		double Test2[] = new double[realnumber];
		double Test3[] = new double[realnumber];
		
		double Labs[] = new double[realnumber]; 
		
		double FinalExam[] = new double[realnumber];
		
		double FinalMark[] = new double[realnumber];
		
		double total=0;
        		
		for(i =0; i < realnumber; i++) {
			Scanner Scanner = new Scanner(System.in);
			
			System.out.print("Student name: ");
		    String name = Scanner.nextLine(); 
		    StudentName[i] = name;
		    
		    System.out.print("Assignment1: ");
			double Assignment1_1 = Scanner.nextDouble();
			Assignment1[i] = Assignment1_1;
			System.out.print("Assignment2: ");
			double Assignment2_2 = Scanner.nextDouble();
			Assignment2[i] = Assignment2_2;
			
			System.out.print("Test1: ");
			double Test1_1 = Scanner.nextDouble();
			Test1[i] = Test1_1;
			System.out.print("Test2: ");
			double Test2_2 = Scanner.nextDouble();
			System.out.print("Test3: ");
			Test2[i] = Test2_2;
			double Test3_3 = Scanner.nextDouble();
			Test3[i] = Test3_3;
			if (Test1_1 < Test2_2 && Test1_1 < Test3_3) {
				TestFinal[i] = Test2_2 + Test3_3;
				System.out.println("Test1 has been dropped!");
				note[i] =  "Test1 has been dropped!";
			}
			else if (Test1_1 == Test2_2 && Test1_1 < Test3_3) {
				TestFinal[i] = Test2_2 + Test3_3;
				System.out.println("Test1 or Test2 can be dropped!");
				note[i] = "Test1 or Test2 can be dropped!";
			}
			else if(Test2_2 < Test1_1 && Test2_2 < Test3_3) {
				TestFinal[i] = Test1_1 + Test3_3;
				System.out.println("Test2 has been dropped!");
				note[i] = "Test2 has been dropped!";
			}
			else if(Test3_3 == Test1_1 && Test1_1 < Test2_2) {
				TestFinal[i] = Test1_1 + Test3_3;
				System.out.println("Test1 or Test3 can be dropped!");
				note[i] = "Test1 or Test3 can be dropped!";
			}
			else if(Test3_3 < Test1_1 && Test3_3 < Test2_2) {
				TestFinal[i] = Test1_1 + Test2_2;
				System.out.println("Test3 has been dropped!");
				note[i] = "Test3 has been dropped!";
			}
			else if(Test2_2 == Test3_3 && Test2_2 < Test1_1) {
				TestFinal[i] = Test1_1 + Test2_2;
				System.out.println("Test2 or Test3 can be dropped!");
				note[i] = "Test2 or Test3 can be dropped!";
			}
			else if(Test1_1 == Test2_2 && Test2_2 == Test3_3) {
				TestFinal[i] = Test1_1 + Test2_2;
				System.out.println("Anyone of Test1, Test2 or Test3 can be dropped!");
				note[i] = "Anyone of Test1, Test2 or Test3 can be dropped!";
			}
			
			System.out.print("Labs: ");
		    double Labs_ = Scanner.nextDouble(); 
		    Labs[i] = Labs_;
		    
		    System.out.print("Final Exam: ");
		    double FinalExam_ = Scanner.nextDouble(); 
		    FinalExam[i] = FinalExam_;
		    
		    FinalMark[i] = (Assignment1[i] + Assignment2[i])*30/20 + (TestFinal[i])*30/40 + (Labs_)* 0.5 + (FinalExam_)* 0.3;
		    System.out.printf("%s's Final Mark is %f.\n", StudentName[i],FinalMark[i]);
		    
		    total = total + FinalMark[i];
		    
		 
		    if(FinalMark[i]< 50 || (Assignment1[i] + Assignment2[i])*3/2 + (TestFinal[i])*3/4 + (Labs_)* 0.5 < 50 || FinalExam_ < 50 ) {
		    	System.out.println("Letter Grade: F");
		    	gradeLetter[i] = "Letter Grade: F";
		    	F++;
		    }
		    else {
		    	if(90 <= FinalMark[i] && FinalMark[i] <= 100) {
			    	System.out.println("Letter Grade: A+");
			    	gradeLetter[i] = "Letter Grade: A+";
			    	Aplus++;
			    }
			    else if(80 <= FinalMark[i] && FinalMark[i] <= 89) {
			    	System.out.println("Letter Grade: A");
			    	gradeLetter[i] = "Letter Grade: A";
			    	A++;
			    }
			    else if(75 <= FinalMark[i] && FinalMark[i] <= 79) {
			    	System.out.println("Letter Grade: B+");
			    	gradeLetter[i] = "Letter Grade: B+";
			    	Bplus++;
			    }
			    else if(70 <= FinalMark[i] && FinalMark[i] <= 74) {
			    	System.out.println("Letter Grade: B");
			    	gradeLetter[i] = "Letter Grade: B";
			    	B++;
			    }
			    else if(65 <= FinalMark[i] && FinalMark[i] <= 69) {
			    	System.out.println("Letter Grade: C+");
			    	gradeLetter[i] = "Letter Grade: C+";
			    	Cplus++;
			    }
			    else if(60 <= FinalMark[i] && FinalMark[i] <= 64) {
			    	System.out.println("Letter Grade: C");
			    	gradeLetter[i] = "Letter Grade: C";
			    	C++;
			    }
			    else if(55 <= FinalMark[i] && FinalMark[i] <= 59) {
			    	System.out.println("Letter Grade: D+");
			    	gradeLetter[i] = "Letter Grade: D+";
			    	Dplus++;
			    }
			    else if(50 <= FinalMark[i] && FinalMark[i] <= 54) {
			    	System.out.println("Letter Grade: D");
			    	gradeLetter[i] = "Letter Grade: D";
			    	D++;
			    }
		    }
		    
		    System.out.print("\n");
		}//Using this big for loop to enter all values for each student, to show a note and calculate the Final Mark and Letter Grade
		
		System.out.print("%%%%%%%%%%%%%%%%%Display entered values, note, an assigned final mark and letter grade for each student%%%%%%%%%%%%%%%%%%%%%%%%%%%\n");
		
		for(i = 0; i < realnumber; i++) {
			System.out.printf("student name: %s\nAssignment1: %f\nAssignment2: %f\nTest1: %f\nTest2: %f\nTest3: %f\n%s\nLabs: %f\nFinal Exam: %f\nFinal Mark: %f\n%s\n", StudentName[i], Assignment1[i], Assignment2[i], Test1[i], Test2[i], Test3[i], note[i], Labs[i], FinalExam[i], FinalMark[i], gradeLetter[i]);
			System.out.printf("\n");
		}//Using this relatively small for loop to display all values we entered for each student, show a note telling us which test has been dropped, the Final Mark and Letter Grade
		
		System.out.println("%%%%%%%%List the percentage of students obtaining each letter grade%%%%%%%%\r\n" + 
				"%%%%%%%%%%%%%%%%%%%%%%%%%and the class average%%%%%%%%%%%%%%%%%%%%%%%%%\r\n" + 
				"");
		
		System.out.printf("The percentage of A+: %f%%\n", Aplus/realnumber *100 );
		System.out.printf("The percentage of A: %f%%\n", A/realnumber *100 );
		System.out.printf("The percentage of B+: %f%%\n", Bplus/realnumber *100 );
		System.out.printf("The percentage of B: %f%%\n", B/realnumber *100 );
		System.out.printf("The percentage of C+: %f%%\n", Cplus/realnumber *100 );
		System.out.printf("The percentage of C: %f%%\n", C/realnumber *100 );
		System.out.printf("The percentage of D+: %f%%\n", Dplus/realnumber *100 );
		System.out.printf("The percentage of D: %f%%\n", D/realnumber *100 );
		System.out.printf("The percentage of F: %f%%\n", F/realnumber *100 );
		System.out.printf("The class average is : %f%%.\n",total/realnumber);
		//List the percentage of students obtaining each letter grade and the Class average
	}
}
