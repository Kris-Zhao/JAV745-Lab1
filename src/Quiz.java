/**
 * This Quiz class has been developed in order to , create a multiple choice game for students in our class. 
 * It will have 5 questions based on the course material thus far. Final results should be posted upon completion.
 * The user should be able to choose whether the answers are shown at the end of the test or not.
 * 
 * Question3 of Lab1. 
 * @author Yuhang Zhao, student number 150467199
 *
 */

import java.util.Scanner; // import java.util.Scanner for Scanner class

public class Quiz {
/**
 * This main method is firstly to create a loop. Every loop would print one question itself and then prompts the user to type his 
 * answer for this question. After typing his answer, the code will compare whether his is equal to the correct answer for 
 * this corresponding question. If yes, the scores would increase by 1, otherwise, nothing happens.
 * When this loop ends, it would print the final result, that is how many questions you answer correctly.
 * At the end of this program, the user can choose whether the answers are shown at the end of the test or not. If the user types 
 * "yes", the answers would be shown, else if the user types "no". Quiz is over" should be shown.
 * @param args
 * 
 * 
 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores = 0;
		
		String q1 = "How many control structures are in JAVA?\n"
				  + "(a)1\n(b)2\n(c)3\n";
		
		String q2 = "What results can the logical operators return?\n"
				  + "(a)a numeric result\n(b)a boolean result\n(c)not known\n";
		
		String q3 = "What is the Java course instructor's name?\n"
				  + "(a)Eden Burton\n(b)Stven job\n(c)Lebron James\n";
		
		String q4 = "Is Java a extensible programming language?\n"
				  + "(a)Yes\n(b)No\n";
		
		String q5 = "Is the paramenter equal to the argument in Java?\n"
				  + "(a)Yes\n(b)No\n";
		
		String[] questions = new String[] {q1, q2, q3, q4, q5};
		String[] answers = new String[] {"c", "b", "a", "a", "b"};

		
		for(int i = 0; i < 5; i++) {
			//traverse 
			Scanner input = new Scanner(System.in);
			
			System.out.println(questions[i]);
			System.out.print("Please enter your answer: ");
			String decision = input.nextLine();
			
			if(answers[i].equals(decision) ) {
				scores++ ;
			}	
		}//Using the for loop to print every question, type the user's answer and check it's correct or not
		
		Scanner input_ = new Scanner(System.in);
		System.out.printf("\nFinal result: %d/5 is correct\n", scores);//show the final results, that is scores
		System.out.println("Do yo want to show the answers?");
		String decision_ = input_.nextLine();
		if(decision_.equals("yes")) {
			System.out.println("The answers are c, b, a, a, b seperately.");// if type yes, it shows the answers
		}else if(decision_.equals("no")){
			System.out.println("Quiz is over.");//if type no, it shows Quiz is over.
		}
	
	}
}

/**
 * How this choice is selected should be noted in the documentation.
 * After I type my answer for every question, the code will compare whether what I type is equal to the correct answer for this 
 * corresponding question. If yes, the scores would increase by 1, otherwise, nothing happens.
 * In this code program, I use a for loop to traverse all 5 questions, print them and compare the answer that I type with the correct
 * answer corresponding this question. 
 */